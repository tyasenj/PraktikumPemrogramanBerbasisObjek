package Tugas;

public class Dosen extends Pegawai {

    private int jumlahSKS;
    private int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        TARIF_SKS = 500000;
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
