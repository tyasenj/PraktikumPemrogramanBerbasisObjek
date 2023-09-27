package tyase.relasiclass.tugas;

public class Penjual {
    private String id;
    private String nama;
    private String alamat;

    public Penjual(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String info() {
        String info = "";
        info += "Id: " + id + "\n";
        info += "Nama: " + nama + "\n";
        info += "Alamat: " + alamat + "\n";
        return info;
    }
}
