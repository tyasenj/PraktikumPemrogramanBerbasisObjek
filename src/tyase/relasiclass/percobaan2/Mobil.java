package tyase.relasiclass.percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    public Mobil() {
        merk = "Unknown";
        biaya = 0;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String newMerk) {
        merk = newMerk;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int newBiaya) {
        biaya = newBiaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
