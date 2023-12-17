package Quiz_2;

import java.util.ArrayList;

public class Perwalian {
    // Atribut class Perwalian
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private ArrayList<MataKuliah> mataKuliahDiambil;

    // Konstruktor untuk inisialisasi ArrayList
    public Perwalian() {
        daftarMahasiswa = new ArrayList<>();
        mataKuliahDiambil = new ArrayList<>();
    }

    // Metode untuk menambahkan mahasiswa ke dalam perwalian
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    // Metode untuk menambahkan mata kuliah yang diambil oleh mahasiswa
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        mataKuliahDiambil.add(mataKuliah);
    }

    // Metode untuk mencetak data mahasiswa beserta mata kuliah yang diambil
    public void cetakDataMahasiswa() {
        System.out.println("=====================================");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("Nama Mahasiswa : " + mhs.getNama());
            System.out.println("IPK            : " + mhs.hitungIPK());
            System.out.println("NIM            : " + mhs.getNim());
            System.out.println("-------------------------------------");
            System.out.println("Mata Kuliah yang Diambil:");

            for (MataKuliah mk : mataKuliahDiambil) {
                System.out.println("- " + mk.getNamaMataKuliah());
                System.out.println("  SKS  : " + mk.getSKS());
                System.out.println("  Bobot: " + mk.hitungBobot());
            }
            System.out.println("=====================================");
        }
    }
}
