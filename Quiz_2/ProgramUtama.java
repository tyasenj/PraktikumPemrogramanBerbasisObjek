package Quiz_2;

public class ProgramUtama {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Tyase", "2241720012", 85);
        Mahasiswa mhs2 = new Mahasiswa("Nisa'an", "2241720011", 95);

        // Membuat objek mata kuliah
        MataKuliah mk1 = new MataKuliah("Matematika", 3, 90);
        MataKuliah mk2 = new MataKuliah("Fisika", 4, 80);

        // Membuat objek perwalian
        Perwalian perwalian = new Perwalian();

        // Menambahkan mahasiswa ke dalam perwalian
        perwalian.tambahMahasiswa(mhs1);
        perwalian.tambahMahasiswa(mhs2);

        // Menambahkan mata kuliah yang diambil oleh mahasiswa
        perwalian.tambahMataKuliah(mk1);
        perwalian.tambahMataKuliah(mk2);

        // Cetak hasil perwalian
        perwalian.cetakDataMahasiswa();
    }
}
