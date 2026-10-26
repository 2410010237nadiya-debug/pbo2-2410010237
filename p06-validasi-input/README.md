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
| 1  | <deskripsi temuan> | <perbaikan yang dilakukan> | [`abc1234`](<tautan-commit>) |
| 2  | <deskripsi temuan> | <perbaikan yang dilakukan> | [`def5678`](<tautan-commit>) |
| 3  | <deskripsi temuan> | <perbaikan yang dilakukan> | [`ghi9012`](<tautan-commit>) |

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
