package tyase.relasiclass.tugas;

public class Transaksi {
    private String kode;
    private Pembeli pembeli;
    private Penjual penjual;
    private Barang[] daftarBarang;

    public Transaksi(String kode, Pembeli pembeli, Barang[] daftarBarang) {
        this.kode = kode;
        this.pembeli = pembeli;
        this.penjual = penjual;
        this.daftarBarang = daftarBarang;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

    public Barang[] getDaftarBarang() {
        return daftarBarang;
    }

    public void setDaftarBarang(Barang[] daftarBarang) {
        this.daftarBarang = daftarBarang;
    }

    public int totalHarga() {
        int total = 0;
        for (Barang barang : daftarBarang) {
            total += barang.getHarga();
        }
        return total;
    }

    public String info() {
        String info = "";
        info += "Kode Transaksi: " + kode + "\n";
        info += "Pembeli:\n" + pembeli.info() + "\n";
        info += "Daftar Barang:\n";
        for (Barang barang : daftarBarang) {
            info += barang.info() + "\n";
        }
        info += "Total Harga: " + totalHarga() + "\n";
        return info;
    }
}
