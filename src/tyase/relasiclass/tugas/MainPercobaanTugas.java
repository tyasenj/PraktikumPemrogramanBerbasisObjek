package tyase.relasiclass.tugas;

public class MainPercobaanTugas {
    public static void main(String[] args) {
        Barang barang1 = new Barang("B001", "Laptop", 8000000);
        Barang barang2 = new Barang("B002", "Smartphone", 3000000);

        Pembeli pembeli1 = new Pembeli("PB001", "Budi", "Jl. Harmoni No. 67");
        Pembeli pembeli2 = new Pembeli("PB002", "Ani", "Jl. Citra No. 32");

        Barang[] daftarBarangTransaksi1 = { barang1, barang2 };
        Barang[] daftarBarangTransaksi2 = { barang1 };

        Transaksi transaksi1 = new Transaksi("T001", pembeli1, daftarBarangTransaksi1);

        Transaksi transaksi2 = new Transaksi("T002", pembeli2, daftarBarangTransaksi2);

        System.out.println("Informasi Transaksi 1:");
        System.out.println(transaksi1.info());

        System.out.println("\nInformasi Transaksi 2:");
        System.out.println(transaksi2.info());
    }
}
