package Percobaan1;

public class karyawan {
    public String nama, alamat, jk;
    public int umur, gaji;

    public karyawan() {
    }

    public karyawan(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

    public void tampilDataKaryawan() {
        System.out.println("Nama            =" + nama);
        System.out.println("Alamat          =" + alamat);
        System.out.println("Jenis Kelamin   =" + jk);
        System.out.println("Umur            =" + umur);
        System.out.println("Gaji            =" + gaji);
    }
}
