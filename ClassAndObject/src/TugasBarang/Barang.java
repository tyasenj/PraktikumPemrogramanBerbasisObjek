package TugasBarang;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public void hargaJual() {
        float hitungHargaJual = hargaDasar - (diskon / 100 * hargaDasar);
        System.out.println("Harga Jual      : " + hitungHargaJual);
    }

    public void tampilData() {
        System.out.println("Kode barang     : " + kode);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Harga Dasar     : Rp." + hargaDasar);
        System.out.println("Diskon          : " + diskon + "%");
    }
}
