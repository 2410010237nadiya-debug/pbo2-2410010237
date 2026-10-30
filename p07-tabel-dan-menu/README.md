# P07 – Tabel dan Menu (Aplikasi Daftar Kontak)

Proyek Praktikum PBO 2 Pertemuan 7: `JTable` dengan `AbstractTableModel`, `JMenuBar`, dan `JDialog` modal.

- Nama: Nadiya Ramadani
- NPM: 5C Reguler Pagi Banjarmasin


## Jawaban Eksperimen Praktikum 5

### Eksperimen 1
Setelah baris `fireTableRowsInserted` saya jadikan komentar lalu saya tambah kontak baru, tabelnya tidak langsung berubah. Datanya sebenarnya sudah masuk ke daftar, tapi tabel tidak diberi tahu, jadi tidak menggambar ulang. Tulisan di bawah juga jadi tidak cocok, misalnya masih tertulis 5 padahal datanya sudah 6. Kontak baru baru kelihatan setelah saya mengetik sesuatu di kolom cari. Jadi tiap data berubah, model harus memanggil method fire supaya tabel tahu.

### Eksperimen 2
Saya cari kata "ah", lalu pilih Ahmad Fauzi dan klik Hapus. Yang muncul di dialog konfirmasi adalah nama Budi Santoso, bukan Ahmad Fauzi. Ini karena Ahmad Fauzi ada di baris ke-1 pada tampilan, sedangkan di model baris ke-1 itu Budi Santoso. Nomor baris tampilan langsung dipakai sebagai nomor baris model, jadi kontak yang diambil salah. Makanya nomor barisnya harus diubah dulu pakai `convertRowIndexToModel`. Saya pilih No jadi tidak ada data yang terhapus.

### Eksperimen 3
Dialognya jadi tidak modal, jadi waktu dialog terbuka saya masih bisa klik jendela utama. Setelah saya isi data dan klik Simpan, kontak yang saya tambahkan tidak muncul di tabel. Penyebabnya, kalau dialog tidak modal, program tidak menunggu dialog ditutup. Method `tampilkan()` langsung mengembalikan null karena saya belum sempat mengisi apa-apa, jadi proses tambah ke model tidak pernah dijalankan.

### Eksperimen 4
Ctrl+N bisa dipakai terus, tapi Ctrl+E dan Ctrl+D tidak jalan kalau belum ada baris yang dipilih. Soalnya item menu Ubah dan Hapus dinonaktifkan oleh method `perbaruiTombol()` saat tidak ada baris yang dipilih, dan menu yang nonaktif tidak bisa dijalankan, termasuk lewat pintasan keyboard. Item Tambah tidak pernah dinonaktifkan, makanya Ctrl+N selalu bisa.

### Eksperimen 5
Baris yang berubah di `initComponents()` adalah baris `setAccelerator` milik `hapusItem`. Tombol `VK_D` berubah menjadi `VK_DELETE`, dan bagian `CTRL_DOWN_MASK` berubah menjadi 0 karena sudah tidak memakai Ctrl.

### Eksperimen 6
Waktu dijalankan, aplikasinya gagal terbuka dan muncul error `IllegalArgumentException: Cannot set a null TableModel`. Penyebabnya, `initComponents()` memanggil `setModel(model)` di awal konstruktor, sedangkan model baru dibuat setelah itu, jadi saat dipanggil isinya masih null dan JTable menolaknya. Makanya atribut model harus sudah dibuat sejak dideklarasikan.
