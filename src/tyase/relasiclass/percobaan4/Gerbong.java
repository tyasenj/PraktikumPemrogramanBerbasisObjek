package tyase.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    // private int jumlah;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        // this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        // soal no 5 Percobaan 4
        if (nomor >= 1 && nomor <= arrayKursi.length) {
            if (this.arrayKursi[nomor - 1].getPenumpang() == null) {
                this.arrayKursi[nomor - 1].setPenumpang(penumpang);
            } else {
                System.out.println("Kursi telah terisi, silahkan mencari kursi lain!");
            }
        } else {
            System.out.println("Nomor kursi tidak valid");
        }
    }

    // public Kursi[] getArrayKursi() {
    // return arrayKursi;
    // }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
