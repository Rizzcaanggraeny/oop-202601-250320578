# Catatan Minggu 02: Struktur OOP: Class, Object, Encapsulation 


## Yang saya kerjakan
Pada minggu kedua ini saya membuat class 'Aset' menggunakan Java. Di dalam class tersebut ada empat data yang digunakan yaitu kode, nama, status dan kondisi. Saya menggunakan private pada setiap field supaya datanya tidak bisa diubah secara langsung dari luar class.

Saya juga membuat konstruktor untuk mengisi kode dan nama aset saat objek dibuat untuk status dan kondisi, saya memberikan nilai awal 'TERSEDIA' dan 'BAIK'. Selain itu, saya membuat getter untuk mengambil data dan setter untuk mengubah data tertentu. Saya juga mencoba membuat method 'wajibAdaIsi()' untuk mengecek apakah kode dan nama sudah diisi atau masih kosong.

Dari proses ini, saya mulai belajar bagaimana cara membuat class dan mengatur data di dalamnya supaya lebih rapi. 

## Keputusan desain
Saya menggunakan private karena data aset tidak bisa diubah sembarangan dari luar class. Kemudian field kode juga menggunakan final, sehingga nilainya tidak dapat diubah setelah ditentukan. Menurut yang saya pahami semua hal ini berguna karena kode aset sebaiknya tetap sama sejak objek dibuat.

kemudian membuat method 'wajibAdaIsi()' hal ini digunakan untuk memeriksa kode dan nama agar tidak kosong. Dengan adanya method, pengecekan bisa digunakan kembali tanpa harus menuliskan kode yang sama berulang kali. Selain itu, pemberian nilai awal 'TERSEDIA' dan 'BAIK' membuat setiap objek aset memiliki status dan kondisi sejak pertama kali dibuat. Dari sini, saya mulai memahami alasan beberapa aturan tersebut diterapkan dalam sebuah class.

## Kendala
Saat mencoba memahami dan memperbaiki kode, saya sempat mengalami error karena salah menuliskan nama variabel pada bagian return. Awalnya, saya hanya menggunakan 'nilai', padahal variabel yang dibuat bernama 'nilaiString' sehingga ketika di run selalu muncul problem yang di hasilkan dari codenya. Setelah memeriksa kembali kode dan memperbaikinya menjadi 'nilaiString.trim()', error tersebut dapat diatasi.

Dari pengalaman tersebut, saya menyadari bahwa kesalahan kecil dalam penulisan kode bisa menyebabkan program mengalami error. Saya juga mulai belajar untuk membaca kembali pesan error dan memeriksa bagian kode yang bermasalah sebelum melakukan perbaikan.

## Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Saya menggunakan ChatGPT untuk membantu memahami penyebab error, mempelajari fungsi validasi pada kode, dan mencari tahu cara menjalankan file pengujian melalui PowerShell karena pengujiannya harusnya itu '\scripts\uji.ps2' tapi tidak bisa sehingga saya mencari solusi ke ai untuk mengatasinya.
- Prompt utama: 
1. Kenapa muncul error nilai cannot be resolved pada kode Java saya ?
2. Bagaimana cara mengecek agar kode dan nama aset tidak kosong ?
3. Bagaimana cara menjalankan file pengujian melalui PowerShell ?
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menggunakan saran ai untuk membantu memperbaiki error yang ada pada kode. Namun, saya tidak langsung mengikuti arahan atau saran yang diberikan ai tanpa memahami fungsi terlebih dahulu. Saya memilih untuk memperbaiki bagian yang error yaitu nama variabel pada method 'wajibAdaIsi()' awalnya saya tulis 'return nilai.trim();' kemudian saya ubah menjadi 'return nilaiString.trim();' karena nama variabel yang digunakan ternyata adalah nilaiString.

- Satu hal yang saya pahami lebih baik sekarang: Setelah mencoba membaca, menganalisis, dan memperbaiki kode, saya mulai memahami fungsi private, getter, setter, dan validasi data. Saya memang belum sepenuhnya memahami semua bagian kode, tetapi saya mulai mengerti bagaimana bagian-bagian tersebut saling berhubungan dalam sebuah class Java.
