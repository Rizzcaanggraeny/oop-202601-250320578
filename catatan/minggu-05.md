# Catatan Minggu 05 :  Abstraction

## Yang saya kerjakan
Pada praktikum minggu 5, saya mempelajari tentang abstraction dalam Java, saya mengubah class Aset menjadi abstract class dan melengkapi method bisaDipinjam() sesuai ketentuan. Selain itu, saya membuat DendaFlat dan DendaProgresif yang menggunakan interface AturanDenda untuk menghitung denda keterlambatan.

## Keputusan desain
Pada praktikum ini, saya memilih menjadikan Aset sebagai abstract class karena class tersebut menjadi dasar dari beberapa jenis aset, seperti Laptop, AlatLab, dan Ruang jadi, Aset tidak dibuat menjadi objek secara langsung, tetapi digunakan sebagai dasar untuk class turunannya. Saya juga menggunakan interface AturanDenda supaya perhitungan denda bisa memiliki aturan yang berbeda untuk DendaProgresif, saya menggunakan pengali berdasarkan lama keterlambatan, yaitu 1 kali untuk 1–7 hari, 2 kali untuk 8–14 hari, 3 kali untuk 15–30 hari, dan 4 kali untuk lebih dari 30 hari.

## Kendala
  saya memiliki kendala saat mengetes minggu-05 pada code pada bagian class harusnya menjadi abstract class saya juga perlu menyesuaikan method hitungDenda() yang sebelumnya masih memiliki nilai pengembalian 0 agar menjadi method abstrak. Untuk mengatasinya, saya membaca kembali instruksi praktikum dan mencoba memperbaiki bagian kode yang belum sesuai. Setelah dilakukan perbaikan, saya menjalankan kembali pengujian dan akhirnya semua tes dari Minggu 1 sampai Minggu 5 berhasil tanpa ada kegagalan

## Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Memahami konsep abstraction, penggunaan abstract class pada Aset, serta penerapan interface AturanDenda pada DendaFlat dan DendaProgresif.
- Prompt utama: 
1. Apa perbedaan abstract class dan interface dalam Java?
2. Bagaimana cara menentukan apakah aset bisa dipinjam berdasarkan status dan kondisinya?
3. Bagaimana cara membuat perhitungan denda progresif sesuai aturan praktikum?
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya mengikuti saran untuk mengubah method hitungDenda() pada class Aset menjadi method abstrak karena hal tersebut memang diminta dalam praktikum.
- Satu hal yang saya pahami lebih baik sekarang: Dari praktikum ini, saya mulai memahami bahwa abstract class dapat digunakan sebagai dasar untuk class turunannya, sedangkan interface digunakan sebagai aturan method yang harus diterapkan oleh class tertentu dan saya juga belajar bahwa perhitungan denda bisa memiliki aturan yang berbeda.
