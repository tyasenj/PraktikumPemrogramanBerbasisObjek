package Mahasiswa;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No. 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Andi";
        mhs2.alamat = "Jl. Mawar No. 12";
        mhs2.kelas = "1C";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Sania";
        mhs3.alamat = "Jl. Anggur No. 4D";
        mhs3.kelas = "1B";
        mhs3.tampilBiodata();
    }
}
