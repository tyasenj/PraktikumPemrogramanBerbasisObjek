# Quiz

### Pemrograman Berbasis Objek

Nama: Tyase Nisa'an Jamilaa

Kelas: 2C

NIM: 2241720012

---

### 1. Class dan Object

- Apa yang dimaksud dengan "class" dalam pemrograman berorientasi objek?

  **Jawab:** Dalam pemrograman berorientasi objek class adalah sebuah blueprint yang mendefinisikan variabel dan method pada seluruh objek tertentu. Class berfungsi sebagai kerangka dasar yang digunakan untuk membuat objek-objek. Contoh class dalam pemrograman bisa berupa Mahasiswa, Mobil, Laptop, dan lain-lain.

- Bagaimana Anda mendefinisikan objek dari suatu class dalam Bahasa pemrograman Java?

  **Jawab:** Untuk mendefinisikan objek dari suatu class dapat dilakukan dengan melakukan instansiasi atau pembuatan objek dari class tersebut. Caranya adalah dengan menggunakan kata kunci "new" diikuti dengan nama class dan tanda kurung. Contohnya, jika Anda memiliki class "Mobil", Anda dapat membuat objek dari class tersebut dengan cara sebagai berikut:
  **Mobil mobilBaru = new Mobil();**

- Misalkan Anda memiliki class "Barang" dalam sistem informasi inventaris. Bagaimana Anda akan membuat objek "laptop" dari class tersebut?

  **Jawab:** Untuk membuat objek "laptop" dari class "Barang" dalam sistem informasi inventaris, pertama perlu melakukan instansiasi atau pembuatan objek dari class tersebut menggunakan kata kunci "new" diikuti dengan nama class dan tanda kurung. Contohnya, jika Anda memiliki class "Barang", Anda dapat membuat objek "laptop" dari class tersebut dengan cara sebagai berikut:
  **Barang laptop = new Barang();**

### 2. Encapsulation

- Jelaskan konsep encapsulation dalam pemrograman berorientasi objek dan mengapa hal ini penting dalam pengembangan sistem informasi inventaris barang.

  **Jawab:** Enkapsulasi adalah salah satu prinsip dalam pemrograman berorientasi objek (OOP) yang berguna untuk "membungkus" sebuah kelas, sehingga informasi yang ada di dalamnya tidak dapat diakses secara sembarangan oleh program lain. Dalam pengembangan sistem informasi inventaris barang konsep ini berfungsi untuk:

  1. **Penyembunyian Informasi** **_(Information Hiding)_**
     Penggunaan enkapsulasi dapat menyembunyikan rincian implementasi dari pemakai. Dalam konteks sistem informasi inventaris barang, kita dapat melindungi data inventaris yang sensitif, seperti harga, jumlah, dan lokasi barang, agar tidak dapat diakses atau dimodifikasi oleh program lain.

  2. **Modularitas**
     Kode internal dapat dikelola secara terpisah sehingga kita bebas melakukan modifikasi yang tidak menyebabkan masalah pada bagian-bagian lain dari sistem Pada sistem informasi inventaris barang, kita dapat dengan mudah menambah, menghapus, atau mengubah objek-objek inventaris tanpa harus mempengaruhi keseluruhan sistem.

  3. **Keamanan Informasi**
     Dengan enkapsulasi maka dapat mengendalikan akses terhadap data dan metode dalam suatu kelas. Dalam sistem informasi inventaris barang, kita dapat melindungi data inventaris yang sensitif, sehingga menjaga keamanan informasi perusahaan.

- Dalam konteks sistem informasi inventaris, sebutkan contoh atribut (variabel) yang harus di-encapsulate dan mengapa.

  **Jawab**

  1. Harga: Atribut harga barang harus di-encapsulate agar tidak dapat diakses atau dimodifikasi oleh program lain yang tidak berwenang. Hal ini penting untuk menjaga keamanan informasi perusahaan dan mencegah terjadinya manipulasi harga barang.

  2. Kondisi: Atribut kondisi barang harus di-encapsulate agar tidak dapat diakses atau dimodifikasi oleh program lain yang tidak berwenang. Hal ini penting untuk menjaga keakuratan data inventaris dan mencegah terjadinya kesalahan dalam pengambilan keputusan.

  3. Jumlah: Atribut jumlah barang harus di-encapsulate agar tidak dapat diakses atau dimodifikasi oleh program lain yang tidak berwenang. Hal ini penting untuk menjaga keakuratan data inventaris dan mencegah terjadinya kesalahan dalam pengambilan keputusan.

### 3. Relasi Kelas

- Apa yang dimaksud dengan relasi antara kelas dalam pemrograman berorientasi objek?

  **Jawab:** Dalam pemrograman berorientasi objek, relasi antara kelas adalah hubungan yang terjadi antara satu kelas dengan kelas lainnya dalam sebuah aplikasi. Relasi antara kelas ini sangat penting dalam pemrograman berorientasi objek karena memungkinkan kelas-kelas tersebut untuk saling berinteraksi dan bekerja sama untuk menyelesaikan suatu masalah.

- Dalam sistem informasi inventaris barang, bagaimana Anda akan menggambarkan relasi antara kelas "Barang" dan kelas "Kategori"?

  **Jawab:** Kelas “Barang” memiliki atribut-atribut seperti nama barang, jumlah, harga, dan lain-lain. Kelas "Kategori" memiliki atribut-atribut seperti nama kategori, deskripsi, dan lain-lain. Setiap objek dari kelas "Barang" dapat memiliki relasi dengan satu objek dari kelas "Kategori". Untuk relasi, dapat diterapkan dalam kelas “Barang” yang mencangkup objek-objek seperti meja, kursi, televisi, dan sebagainya, sementara kelas "Kategori" dapat mencakup objek-objek seperti perabotan, elektronik, dan sebagainya.

### 4. PBL

- Berdasarkan kasus sistem informasi inventaris barang, coba buat sebuah class sederhana beserta atribut dan metodenya yang menggambarkan suatu entitas dalam sistem tersebut (misalnya, class "Barang").

<img src = "GB 1.png">
<img src = "GB 2.png">

- Bagaimana Anda akan menggunakan encapsulation untuk melindungi atributatribut dalam class tersebut?
  **Jawab:** Atribut dinyatakan sebagai private agar tidak dapat diakses langsung dari luar class, menggunakan metode getter (misalnya, getNama(), getJumlah(), dll.) untuk mendapatkan nilai atribut, dan menggunakan metode setter (misalnya, setNama(), setJumlah(), dll.) untuk mengatur nilai atribut.

- Gambarkan hierarki class atau hubungan antar class yang mungkin ada dalam
  sistem informasi inventaris barang di jurusan Teknologi Informasi. Berikan contoh
  relasi antar class (misalnya, inheritance atau association) dalam konteks tersebut.

  **Jawab:**

  1. Assosiation:
     Class Barang terkait dengan class Kategori melalui atribut kategori, Class Transaksi terkait dengan class Barang melalui atribut barang

  2. Aggregation:
     Class Ruangan dapat berhubungan dengan class Barang melalui atribut barangDiRuangan.

  3. Inheritance:
     Jika ada beberapa jenis barang dalam inventaris (misalnya, "Barang Elektronik" dan "Barang Peralatan"), maka dapat menggunakan inheritance untuk mengelompokkan di class yang lebih umum, misalnya, class Barang

  Gambaran Class Diagram:
  <img src = "GB 3.png">
