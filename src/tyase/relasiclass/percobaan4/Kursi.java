package tyase.relasiclass.percobaan4;

public class Kursi {
    private String nomor;
    private Penumpang penumpang;
    //private boolean kursiTerisi;
    private boolean tersedia = true;


    public Kursi(String nomor) {
        this.nomor = nomor;
        this.penumpang = null;
        //this.kursiTerisi = false;
    }

    // public boolean getKursiTerisi(){
    //     return kursiTerisi;
    // }

    // public void setKursiTerisi(boolean kursiTerisi) {
    //     this.kursiTerisi = kursiTerisi;
    // }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
