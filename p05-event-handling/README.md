# P05 Event Handling

## 1. Tabel Pengamatan Praktikum 2
| No | Tindakan | Event yang tercatat |
|----|----------|---------------------|
| 1 | Arahkan kursor ke tombol, lalu jauhkan | (isi dari log aplikasi) |
| 2 | Klik tombol Klik saya | |
| 3 | Centang lalu hapus centang Aktifkan fitur | |
| 4 | Ganti pilihan dari Pagi menjadi Malam | |
| 5 | Klik isian, lalu ketik kata "abc" | |
| 6 | Klik tombol setelah mengetik di isian | |

## 2. Jawaban Eksperimen
### Praktikum 3
1. Pesan “item berubah” tercetak 2 kali setiap pilihan combo diganti.
2. Karena keyPressed dipicu saat tombol baru ditekan, sebelum karakter tersebut     dimasukkan ke dalam isian.
3. Exception in thread "AWT-EventQueue-0" java.lang.NumberFormatException: For input string: "tiga"
    at java.base/java.lang.Double.parseDouble(Double.java:993)
    at id.ac.uniska.pbo2.p05.KonversiSuhu.konversi(KonversiSuhu.java:120)
    at id.ac.uniska.pbo2.p05.KonversiSuhu.konversiButtonActionPerformed(KonversiSuhu.java:86)
### Praktikum 4
1. Pesan “kali” tercetak 2 kali setiap tombol diklik. Alasannya, ada dua listener yang terdaftar pada tombol yang sama: satu dari initComponents() (event handler GUI Builder) dan satu dari lambda di konstruktor. Keduanya dijalankan setiap tombol diklik.
Satu tombol sebaiknya hanya memakai satu cara supaya aksinya tidak berjalan ganda. Pada kalkulator ini kebetulan hasil hitungnya sama, jadi tidak tampak.

3. Perubahan di tab Design:
operatorPanel diubah dari Grid Layout 4 kolom menjadi 5 kolom agar tombol baru muat.
Ditambahkan satu Button baru di operatorPanel dengan nama variabel modButton dan text %.
Dibuat event actionPerformed untuk modButton lewat Events (Cara 1).
-Perubahan di tab Source:
Pada modButtonActionPerformed ditulis hitung('%');.
Pada method hitung, ditambahkan satu case di switch:
  case '%' -> a % b;
Pemeriksaan pembagi nol diperluas agar % ikut tercakup (sisa bagi dengan nol juga tidak valid):
  if ((operator == '/' || operator == '%') && b == 0) {

  3. Setelah tombol Hapus ditekan, kursor langsung berada di isian pertama       karena method hapus diakhiri dengan pemanggilan         angka1Field.requestFocusInWindow(). Perintah ini meminta fokus keyboard   dipindahkan ke angka1Field, sehingga pengguna bisa langsung mengetik angka baru tanpa mengklik isian terlebih dahulu. Tanpa baris itu, fokus tetap berada di tombol Hapus yang baru diklik.

## 3. Peta Event FormAnggotaPerpustakaan
| Komponen | Menu Events | Aksi |
|----------|-------------|------|
| setujuCheck | Item: itemStateChanged | Tombol Daftar aktif hanya jika dicentang |
| batalButton | Action: actionPerformed | Kosongkan isian, fokus ke NPM |
| daftarButton | Action: actionPerformed | Ringkasan data via JOptionPane |
| npmField | Key: keyReleased | Label "8 dari 10 digit" |
| Form (JFrame) | Window: windowClosing | Konfirmasi sebelum keluar |

## 4. Screenshot Properties > Events (tombol Daftar)
![properties](img/properties-daftar.png)

## 5. Screenshot Dialog Ringkasan
![ringkasan](img/ringkasan.png)

## 6. Screenshot Dialog Konfirmasi Keluar
![keluar](img/konfirmasi-keluar.png)

## 7. Deklarasi Penggunaan AI
(Tulis alat yang dipakai dan untuk apa, atau: "Saya tidak memakai AI.")

