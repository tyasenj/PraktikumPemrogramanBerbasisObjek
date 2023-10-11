package TugasKoperasi;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPeminjaman;

    Anggota(String noKtp, String nama, int limitPeminjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPeminjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String newNoKtp) {
        noKtp = newNoKtp;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public int getJumlahPeminjaman() {
        return jumlahPeminjaman;
    }

    public void setJumlahPeminjaman(int newJumlahPeminjaman) {
        if (newJumlahPeminjaman <= limitPeminjaman) {
            jumlahPeminjaman = newJumlahPeminjaman;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    public void setJumlahAngsuran(int jumlahUang) {
        double minimumAngsuran = 0.10 * jumlahPeminjaman; // 10% dari jumlah pinjaman saat ini
        if (jumlahUang >= minimumAngsuran) {
            jumlahPeminjaman -= jumlahUang;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        }
    }

    public void PeminjamanUang(int jumlahUang) {
        if (jumlahPeminjaman + jumlahUang <= limitPeminjaman) {
            jumlahPeminjaman += jumlahUang;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }
}
