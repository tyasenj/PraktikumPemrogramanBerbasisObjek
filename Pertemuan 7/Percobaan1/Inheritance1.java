package Percobaan1;

public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Budi", "Malang", "Laki-laki", 20, 2000000,
                250000, 200000, "@A", 100000);
        ST.tampilStaffTetap();

        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27, 10000,
                100000, 50000, 100);
        SH.tampilStaffHarian();
        // Manager M = new Manager();
        // M.nama = "Vivin";
        // M.alamat = "Jl. Vinolia";
        // M.umur = 25;
        // M.jk = "Perempuan";
        // M.gaji = 3000000;
        // M.tunjangan = 1000000;
        // M.tampilDataManager();

        // Staff S = new Staff();
        // S.nama = "Lestari";
        // S.alamat = "Malang";
        // S.umur = 25;
        // S.jk = "Perempuan";
        // S.gaji = 2000000;
        // S.lembur = 5000000;
        // S.potongan = 250000;
        // S.tampilDataStaff();

    }
}
