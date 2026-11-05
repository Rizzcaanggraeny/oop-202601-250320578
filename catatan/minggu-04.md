# Catatan Minggu 4 : Polymorphism

## Yang saya kerjakan
Pada praktikum minggu ke-4 saya mengerjakan materi polymorphism dengan menerapkan overriding dan overloading pada program Aset-Pinjam, saya menambahkan method hitungDenda(int hariTerlambat) pada class Laptop.java, AlatLab.java dan Ruang.java dengan perhitungan denda yang berbeda sesuai jenis aset dan yang sudah ditentukan. Selain itu, saya juga memebuat dua method cari() pada class KatalogAset.java untuk mencari aset berdasarkan nama dan jenis aset.

## Keputusan desain
Saya menggunakan overriding karena setiap jenis aset memiliki perhitungan denda yang berbeda, pada class Ruang denda dihitung dengan pengali 1, Laptop dengan pengali 2 sedangkan AlatLab dengan pengali 4 dari tarif dasar yang ada pada Varian.aktif(), dendaPerHari saya menggunakan overloading pada method cari() karena memiliki nama method yang sama  tetapi parameternya berbeda. Dengan begitu, pencarian aset bisa dilakukan berdasarkan nama saja atau nama sekaligus jenis aset.

## Kendala
Kendalanya yaitu ketika menjalankan pengujiannya gagal ternyata terdapat kesalahan pada hasil perhitungan denda pada class Ruang dan pengujian menolak jumlah hari keterlambatan negatif dari hal tersebut saya mengetahui bahwa hasil perhitungan harus sesuai dengan aturan yang sudah ditentukan.

## Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Memeriksa kode minggu ke-4 serta membantu memahami hasil pengujian minggu ke-4
- Prompt utama: 
1. Cek kembali kode program minggu 4
2. jelaskan penyebab error saat menjalankan pengujian polymorphism
- Yang saya ubah atau tolak dari saran AI, dan alasannya: AI menyarankan penggunaan method `validasiHariTerlambat()` pada semua subclass tapi saya memilih menuliskan validasi secara langsung pada class `AlatLab`, sedangkan pada class `Laptop` dan `Ruang` menggunakan method dari class `Aset` supaya tidak perlu mengulang kondisi pengecekan yang sama.
- Satu hal yang saya pahami lebih baik sekarang: Overriding itu ketika sebuah method dari class induk digunakan kembali di class anak, tetapi isi atau cara kerjanya dibuat berbeda sedangkan overloading itu ketika kita membuat beberapa method dengan nama yang sama, tetapi parameternya berbeda.
