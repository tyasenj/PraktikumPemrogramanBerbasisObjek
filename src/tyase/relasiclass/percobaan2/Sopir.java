package tyase.relasiclass.percobaan2;

public class Sopir {
    private String nama;
    private int biaya;

    public Sopir() {
        nama = "Unknown";
        biaya = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int newBiaya) {
        biaya = newBiaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }

}
