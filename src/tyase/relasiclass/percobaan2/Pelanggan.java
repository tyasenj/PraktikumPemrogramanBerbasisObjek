package tyase.relasiclass.percobaan2;

public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    Pelanggan() {
        nama = "Unknown";
        mobil = null;
        sopir = null;
        hari = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil newMobil) {
        mobil = newMobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setSopir(Sopir newSopir) {
        sopir = newSopir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int newHari) {
        hari = newHari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) +
                sopir.hitungBiayaSopir(hari);
    }

}
