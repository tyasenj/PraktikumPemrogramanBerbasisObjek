package Percobaan1;

public class Manager extends karyawan {
    public int tunjangan;

    public Manager() {
    }

    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       =" + tunjangan);
        System.out.println("Total Gaji      =" + (super.gaji + tunjangan));
    }
}
