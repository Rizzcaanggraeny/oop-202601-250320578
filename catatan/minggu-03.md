# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
Pada praktikum minggu ketiga, saya mulai mencoba memahami konsep inheritance atau pewarisan pada Java. Saya mempelajari bagaimana class Laptop, AlatLab, dan Ruang menjadi turunan dari class Aset. Dari kode yang saya pelajari, saya melihat penggunaan extends Aset dan super(kode, nama) untuk menghubungkan class turunan dengan class induknya. Saya juga mencoba menganalisis atribut tambahan, validasi pada konstruktor, serta penggunaan method getJenis() dan hitungDenda() pada setiap class.

## Keputusan desain
Dari kode yang saya pelajari, saya memahami bahwa data umum seperti kode, nama, status, dan kondisi diletakkan pada class Aset. Sementara itu, atribut khusus seperti kapasitas, spesifikasi, dan laboratorium diletakkan pada class turunannya masing-masing.

## Kendala
Saya masih mencoba memahami penggunaan super() dan hubungan antara class induk dengan class turunan. Saat pengujian Minggu 3, saya juga menemukan beberapa error sehingga perlu memeriksa kembali kode dan membaca pesan kesalahannya.

## Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Memahami konsep inheritance, penggunaan extends dan super(), serta memeriksa kode pada class Laptop, AlatLab, dan Ruang.
- Prompt utama: Bantu saya memahami konsep inheritance dan periksa kode Laptop.java, AlatLab.java, dan Ruang.java berdasarkan instruksi praktikum Minggu 3.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya mencoba mencocokkan saran tersebut dengan kode yang sudah saya buat dan hasil pengujian yang muncul namun, saran ai saya jadikan referensi dalam mengerjakan dan tidak ada code yang saya ambil dari ai.
- Satu hal yang saya pahami lebih baik sekarang: Saya mulai memahami bahwa inheritance memungkinkan class turunan menggunakan bagian umum dari class induk dan memiliki atribut tambahan sesuai kebutuhannya 


- Catatan : inharitance kurang tepat dibandingkan komposisi seperti contohnya sistem Aset-Pinjam menggunakan layanan notifikasi untuk memberi tahu pengguna ketika peminjaman disetujui. Layanan notifikasi lebih cocok menggunakan komposisi karena hanya membantu menjalankan fungsi tertentu dan bukan termasuk jenis aset.