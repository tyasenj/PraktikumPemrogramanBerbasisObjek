package TugasGame;

public class Peminjaman {
    public static void main(String[] args) {
        Game gm1 = new Game();
        gm1.id = 20144;
        gm1.namaMember = "Tyase";
        gm1.namaGame = "Pou";
        gm1.harga = 40000;
        gm1.lamaSewa = 5;
        ;
        gm1.tampilPeminjaman();

        int hargaTotal = gm1.harga * gm1.lamaSewa;
        System.out.println("Harga Total : " + hargaTotal);
    }
}
