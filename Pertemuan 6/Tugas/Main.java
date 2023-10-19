package Tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(3); // Maksimal 3 pegawai dalam daftar gaji

        Dosen dosen1 = new Dosen("123", "John Doe", "Jl. ABC");
        dosen1.setSKS(10);
        dosen1.getGaji();

        Dosen dosen2 = new Dosen("456", "Jane Smith", "Jl. XYZ");
        dosen2.setSKS(15);
        dosen2.getGaji();

        Pegawai pegawai1 = new Pegawai("789", "Alice Johnson", "Jl. DEF");

        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);
        daftarGaji.addPegawai(pegawai1);

        daftarGaji.printSemuaGaji();
    }
}
