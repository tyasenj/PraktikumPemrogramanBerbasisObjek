package TugasBarang;

public class HitungBarang {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = ("21001");
        brg.namaBarang = ("Sepatu");
        brg.hargaDasar = 120000;
        brg.diskon = 10;
        brg.tampilData();
        brg.hargaJual();
    }
}
