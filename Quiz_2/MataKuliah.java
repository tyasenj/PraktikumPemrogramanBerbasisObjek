package Quiz_2;

public class MataKuliah {
    // Atribut class MataKuliah
    private String namaMataKuliah;
    private int sks;
    private double nilaiMahasiswa;

    // Konstruktor untuk inisialisasi atribut
    public MataKuliah(String namaMataKuliah, int sks, double nilaiMahasiswa) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    public int getSKS() {
        return sks;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    // Metode untuk menghitung bobot mata kuliah berdasarkan nilai mahasiswa
    public double hitungBobot() {
        return nilaiMahasiswa * sks;
    }

    // Overload metode hitungBobot untuk menghitung bobot dengan bobot_mahasiswa
    public double hitungBobot(double bobotMahasiswa) {
        return nilaiMahasiswa * sks * bobotMahasiswa;
    }
}
