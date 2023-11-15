package TugasOverriding;

public class MainManusia {
    public static void main(String[] args) {
        Manusia mahasiswa1 = new Mahasiswa();
        Manusia dosen1 = new Dosen();

        // Memanggil metode-metode dari objek dengan tipe Manusia
        mahasiswa1.bernafas();
        mahasiswa1.makan();

        dosen1.bernafas();
        dosen1.makan();

        ((Mahasiswa) mahasiswa1).tidur();
        ((Dosen) dosen1).lembur();
    }
}
