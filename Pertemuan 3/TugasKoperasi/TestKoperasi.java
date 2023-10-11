package TugasKoperasi;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("350513500", "Donny", 5000000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPeminjaman());

        // System.out.println("\nMeminjam uang 10.000.000...");
        // donny.setJumlahPeminjaman(10000000);
        // System.out.println("Jumlah pinjaman saat ini: " +
        // donny.getJumlahPeminjaman());

        // System.out.println("\nMeminjam uang 4.000.000...");
        // donny.setJumlahPeminjaman(4000000);
        // System.out.println("Jumlah pinjaman saat ini: " +
        // donny.getJumlahPeminjaman());

        // System.out.println("\nMembayar angsuran 100.000...");
        // donny.setJumlahAngsuran(100000);
        // System.out.println("Jumlah pinjaman saat ini: " +
        // donny.getJumlahPeminjaman());

        // System.out.println("\nMembayar angsuran 3.000.000...");
        // donny.setJumlahAngsuran(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " +
        // donny.getJumlahPeminjaman());

        // MENGGUNAKAN INPUT CONSOLE
        System.out.print("\nMasukkan jumlah pinjaman: ");
        int jumlahPinjaman = sc.nextInt();
        donny.setJumlahPeminjaman(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());

        System.out.print("\nMasukkan jumlah pinjaman lagi: ");
        jumlahPinjaman = sc.nextInt();
        donny.setJumlahPeminjaman(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());

        System.out.print("\nMasukkan jumlah angsuran: ");
        int jumlahAngsuran = sc.nextInt();
        donny.setJumlahAngsuran(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());

        System.out.print("\nMasukkan jumlah angsuran lagi: ");
        jumlahAngsuran = sc.nextInt();
        donny.setJumlahAngsuran(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());

        // Tutup scanner setelah selesai
        sc.close();
    }
}
