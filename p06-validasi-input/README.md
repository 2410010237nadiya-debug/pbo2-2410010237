# pbo2-2410010237
# <P06-Validasi-Input>

**Nama:** Nadiya Ramadani
**NPM:** 2410010237
**Kelas:** 5C Reguler Pagi Banjarmasin

---

## 1. Lembar Peer Review dari Teman

Peer review diterima dari: **<Nama Teman>**

![Lembar peer review](docs/peer-review.jpg)

## 2. Tabel Temuan dan Perbaikan

| No | Temuan dari Teman | Perbaikan yang Dilakukan | Commit |
|----|-------------------|--------------------------|--------|
| 1  | Tombol Daftar nonaktif tanpa penjelasan sehingga pengguna tidak tahu alasannya (Visibilitas status sistem). | Menambahkan tooltip pada `daftarButton` yang memberi tahu bahwa persetujuan harus dicentang dulu. | [`abc1234`](<tautan-commit>) |
| 2  | NPM dan Program Studi wajib diisi untuk semua jenis anggota, padahal Dosen dan Umum tidak memilikinya (Kesesuaian dengan dunia nyata). | Menambahkan `jenisBerubah()` yang menonaktifkan NPM dan Prodi saat jenis anggota bukan Mahasiswa, dan membuat pemeriksaan di `daftar()` bersyarat. | [`def5678`](<tautan-commit>) |
| 3  | Konfirmasi keluar muncul walau form masih kosong (Kendali dan kebebasan pengguna). | Mengubah `formWindowClosing` supaya konfirmasi hanya tampil jika `adaIsian()` bernilai true. | [`ghi9012`](<tautan-commit>) |
| 4  | Font Segoe UI diset manual sehingga bertabrakan dengan `styleClass` FlatLaf, dan keterangan di bawah judul tampil tebal (Konsistensi dan standar). | Menghapus font manual dengan `setFont(null)` pada lima komponen di konstruktor, supaya gaya FlatLaf yang berlaku. | [`jkl3456`](<tautan-commit>) |
| 5  | Paste huruf ke kolom NPM dan HP lolos dari `keyTyped` (Pencegahan kesalahan). | Menambahkan `DocumentFilter` (`FilterAngka`) pada NPM dan HP, dengan batas 10 dan 13 digit. | [`mno7890`](<tautan-commit>) |
| 6  | Kolom Nama tidak punya contoh isian dan format HP hanya ada di tooltip (Mengenali, bukan mengingat). | Menambahkan placeholder pada kolom Nama dan memperjelas placeholder HP. | [`pqr1234`](<tautan-commit>) ||

## 3. Tangkapan Layar Form dengan Pesan Kesalahan

![Form dengan pesan kesalahan](docs/form-error.png)

Keterangan: <jelaskan kondisi input yang memicu pesan kesalahan, mis. kolom email dikosongkan>

## 4. Tangkapan Layar Jendela Navigator (Label Pesan)

![Jendela Navigator](docs/navigator.png)

Keterangan: <jelaskan label pesan yang tampak pada Navigator>

## 5. Jawaban Eksperimen Praktikum 4
1. Waktu saya ketik huruf di isian NPM, hurufnya tidak muncul sama sekali. Hanya
angka yang bisa masuk. Penyebabnya ada di baris `evt.consume();` pada
`npmFieldKeyTyped` (baris <nomor baris>). Baris itu jalan kalau karakter yang
diketik bukan angka, dan fungsinya membuang ketikan tersebut sebelum masuk ke
isian.
2. Pesan kesalahan baru muncul setelah saya menekan Tab, yaitu saat isian email
kehilangan fokus. Waktu mengetik belum ada pesan apa pun. `siti@` dianggap
salah karena tidak ada nama domain setelah tanda `@`.
3. Tidak muncul pesan kesalahan. Menurut saya itu karena isian yang kosong
dilewati dulu oleh validasi saat fokus hilang, sebab pengguna mungkin belum
sempat mengisinya. Pengecekan wajib isi baru dilakukan saat tombol Daftar
ditekan.
4. Fokus pindah ke isian NPM, yaitu isian pertama dari atas yang belum valid.
Bingkai merah pada NPM terlihat lebih tebal dibanding isian lain, dan di
bawah setiap isian yang kosong muncul pesan "wajib diisi". Di pojok kiri
bawah juga muncul ringkasan "5 isian perlu diperbaiki" (NPM, Nama Lengkap,
Program Studi, Email, dan Nomor HP).
5. Fokus pindah ke isian <Nama Lengkap / NPM, sesuai yang saya lihat>. Yang
mengatur ini adalah properti `displayedMnemonic` pada label (diisi huruf N),
yang dipasangkan dengan properti `labelFor` supaya mengarah ke isian
tujuannya. Pada label, huruf N tampak bergaris bawah saat tombol Alt ditekan.
6. Datanya tetap ada. Saat tombol Batal diklik muncul dialog konfirmasi, dan
form hanya dikosongkan kalau saya memilih Yes. Kalau memilih No, tidak ada
kode reset yang dijalankan, jadi semua isian tetap seperti semula.

## 6. Deklarasi Penggunaan AI
Saya menggunakan (Claude Ai) untuk <keperluan spesifik,  memahami pesan kesalahan>. Seluruh kode dan jawaban telah saya tinjau dan pahami sendiri ada beberapa codenya yang saya masukan ke Ai supaya saya tau apa yang salah dari code saya.
