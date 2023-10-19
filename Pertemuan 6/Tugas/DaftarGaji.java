package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawai;

    public DaftarGaji(int maxSize) {
        listPegawai = new Pegawai[maxSize];
        jumlahPegawai = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Nama Pegawai: " + listPegawai[i].getNama());
            System.out.println("Gaji: " + listPegawai[i].getGaji());
            System.out.println();
        }
    }
}
