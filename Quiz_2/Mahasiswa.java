package Quiz_2;

public class Mahasiswa {
    // Atribut class Mahasiswa
    private String nama;
    private String nim;
    private double nilai;

    // Konstruktor untuk inisialisasi atribut
    public Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Getter untuk mahasiswa, nim, nilai
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getNilai() {
        return nilai;
    }

    // Metode untuk menghitung IPK berdasarkan nilai
    public double hitungIPK() {
        return nilai * 4 / 100;
    }

    // Overload metode hitungIPK untuk menghitung IPK dengan bobot nilai_sks
    public double hitungIPK(int nilai_sks) {
        return (nilai / nilai_sks) * 4.0;
    }

}
