package Soal5;

public class Main {
    public static void main(String[] args) {
        Penulis p = new Penulis();
        p.setNama("Tere Liye");
        p.setAlamat("Sumatera Selatan");
        Buku b = new Buku();
        b.setISBN("230500127");
        b.setJudul("Hujan");
        b.setHarga(80000);
        b.setPenulis(p);

        System.out.println("=======================================");
        System.out.println("               TENTANG BUKU");
        System.out.println("=======================================");
        System.out.println("ISBN           :" + b.getISBN());
        System.out.println("Judul Buku     :" + b.getJudul());
        System.out.println("Harga          :Rp. " + b.getHarga());
        System.out.println("DATA PENULIS   :");
        System.out.println("Nama           :" + b.getPenulis().getNama());
        System.out.println("Alamat         :" + b.getPenulis().getAlamat());
        System.out.println("=======================================");
    }
}
