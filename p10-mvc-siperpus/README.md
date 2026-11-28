# P10 - Class Diagram dan MVC (SiPerpus)

## Jawaban Eksperimen Praktikum 6

**1. Mengganti `BukuDaoMemori.denganContoh()` menjadi `new BukuDaoMemori()`**
Saat aplikasi dibuka, tabelnya kosong dan status di bawah tertulis "Menampilkan 0 buku". Ini karena `denganContoh()` yang mengisi lima buku contoh, sedangkan `new BukuDaoMemori()` membuat DAO yang kosong. Kelas yang diubah hanya `AplikasiBuku`, satu baris saja. `BukuController` dan `PanelBuku` tidak perlu diubah karena mereka hanya mengenal interface `BukuDao`.

**2. Menambahkan buku berkode PBO-001**
Muncul pesan "Kode PBO-001 sudah dipakai buku lain." Setelah saya klik OK, dialog muncul lagi dan isian yang tadi saya ketik masih ada, jadi saya tidak perlu mengetik ulang. Ini terjadi karena `BukuController` memakai perulangan yang membuka dialog lagi dengan isian sebelumnya selama kodenya masih ganda.

**3. Memindahkan `dao.hapus` ke dalam `PanelBuku`**
`PanelBuku` jadi harus mengimpor `BukuDao`, dan harus punya referensi ke objek DAO. Ini melanggar pola MVC karena view tidak boleh memanggil DAO secara langsung. Tugas view hanya menampilkan data, sedangkan urusan menghapus data seharusnya dikerjakan controller. Kalau view ikut memanggil DAO, tampilan jadi terikat ke cara data disimpan dan sulit dipakai ulang.

**4. Menambahkan `List<Buku> stokHabis();` di `BukuDao`**
Kelas yang langsung gagal dikompilasi adalah `BukuDaoMemori`. Alasannya, `BukuDaoMemori` mengimplementasikan `BukuDao`, jadi wajib menulis semua method yang ada di interface. Method `stokHabis()` belum ditulis di sana, sehingga muncul error. `BukuController`, `PanelBuku`, dan `AplikasiBuku` tidak error karena mereka hanya memakai interface, bukan mengimplementasikannya.

**5. Menambahkan tombol Cetak di `tombolPanel` tanpa event**
Kelas yang perlu diubah adalah `BukuController`, yaitu untuk memasang listener ke tombol Cetak. `PanelBuku` hanya perlu ditambah getter `getCetakButton()` seperti tombol lainnya. Bukan `PanelBuku` yang menangani aksinya karena panel hanya bertugas menyusun tampilan. Aksi yang memakai data adalah tugas controller, sama seperti tombol Tambah, Ubah, dan Hapus.

## Deklarasi Penggunaan AI

**Alat yang dipakai:** Claude (Anthropic), melalui antarmuka chat.

**Keperluan penggunaan:**
- Membantu membaca dan memahami langkah-langkah di Modul P10, terutama Praktikum 6 (membuat JendelaBuku dan AplikasiBuku).
- Membantu menemukan penyebab error kompilasi pada DialogBuku dan JendelaBuku, seperti method `main` bawaan NetBeans yang bersarang dan komentar yang tidak tertutup.
- Memandu penggunaan fitur NetBeans, seperti memindahkan BukuDaoMemori ke paket `dao.memori`, mengganti nama variabel dan kelas, serta membuat kelas AplikasiBuku

**Yang dikerjakan sendiri sedikit bantuan ai:** kode program mengikuti modul praktikum, penyusunan tampilan di GUI Builder, menjalankan aplikasi, serta pengamatan dan jawaban kelima eksperimen Praktikum 6 tapi di bantu ai untuk membuat kalimatnya
