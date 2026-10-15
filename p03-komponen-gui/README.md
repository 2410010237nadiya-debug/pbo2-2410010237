# P03 - Komponen GUI: Form Pemesanan Tiket Travel

Nama         : Nadiya Ramadani
NPM          : 2410010237
Kelas        : 5C Reguler Pagi Banajarmasin
Mata Kuliah  : PBO 2

## 1. Screenshot Form Saat Dijalankan

Tema terang:
![Tema terang](<img width="549" height="338" alt="Mode Terang" src="https://github.com/user-attachments/assets/d2d6c777-165e-4b65-b8ea-4335970cf160" />
)

Tema gelap:
![Tema gelap](<img width="566" height="334" alt="Mode Gelap" src="https://github.com/user-attachments/assets/b82ccc75-8551-464a-b303-b8bc7b8eb9d6" />
)

## 2. Screenshot Tab Design (Navigator)

![Navigator FormTiketTravel](<img width="938" height="546" alt="Design dan Navigator" src="https://github.com/user-attachments/assets/a79a2e23-43b8-46e4-acdc-14e20c39dd1c" />
)

## 3. Jawaban Pertanyaan Refleksi G

1. TOP-level container Jendela utama yang memiliki bingkai dan judul . Contohnya
JFrame,JDialog
Intermediate container Wadah untuk mengelompokkan komponen. Contohnya
JPanel, JScrollpane,JTabbedpane. 3. Atomic component Komponen yang berinteraksi langsung dengan pengguna. Contohnya JLabel, JTextField, JButton.

2. Dengan ButtonGroup yang sama, kedua tombol dianggap satu kelompok
pilihan, sehingga hanya satu yang bisa terpilih pada satu waktu. Memilih salah satu
otomatis membatalkan pilihan lainnya.

3. Pilih JComboBox Ketika :
Pilihannya Banyak (Misalnya nama provinsi , program studi)
Pilih JRadioButton Ketika :
Pilihannya sedikit (sekitar 2 sampai 4 opsi). Semua opsi sebaiknya langsung terlihat oleh pengguna tanpa perlu mengklik dulu, misalnya Laki-laki/Perempuan atau Ya/Tidak.
   
4. initComponents() adalah kode yang dibuat otomatis oleh GUI Builder
NetBeans, dan setiap kali desain diubah, kode ini ditulis ulang. Jika diedit langsung, perubahan kita akan tertimpa dan hilang, bahkan bisa merusak sinkronisasi antara
tampilan desain dan kodenya. Kode tambahan sebaiknya ditulis di luar blok tersebut, yaitu di konstruktor setelah pemanggilan initComponents() (misalnya untuk
setLocationRelativeTo(null)), di event handler seperti jButton1ActionPerformed, atau
di method buatan sendiri.

5. FlatLightLaf.setup() mengatur Look and Feel (tampilan) aplikasi, dan
tampilan ini diterapkan pada komponen saat komponen tersebut dibuat. Jika dipanggil
setelah form dibuat, komponen sudah terlanjur memakai tampilan bawaan sehingga
tampilannya tidak berubah atau tidak konsisten.Karena itu, pemanggilannya
diletakkan di awal main(), sebelum new NamaForm().setVisible(true), supaya semua
komponen langsung tampil dengan gaya FlatLaf.
   


