package tyase.relasiclass.tugas;

public class Barang {
    private String kode;
    private String namaBrg;
    private double harga;

    public Barang(String kode, String namaBrg, double harga) {
        this.kode = kode;
        this.namaBrg = namaBrg;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return namaBrg;
    }

    public void setNama(String namaBrg) {
        this.namaBrg = namaBrg;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        info += "Nama Barang: " + namaBrg + "\n";
        info += "Harga: " + harga + "\n";
        return info;
    }
}
