package Soal4;

public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    // a. Tambahkan construktor
    // Gunakan construktor untuk mengisi atribut nim, nama, alamat, jenisKelamin

    Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        // b. Buat objek mahasiswa
        // Isis atribut nim, nama, alamat, jenisKelamin
        // lewat construktor

        Mahasiswa ms = new Mahasiswa("2241720012", "Tyase Nisa'an Jamilaa", "Blitar",
                'P');

        System.out.println("NIM: " + ms.nim);
        System.out.println("Nama: " + ms.nama);
        System.out.println("Alamat: " + ms.alamat);
        System.out.println("Jenis Kelamin: " + ms.jenisKelamin);
    }
}
