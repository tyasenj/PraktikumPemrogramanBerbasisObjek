package TugasTeori;

public class MainTeori {
    public static void main(String[] args) {
        PersegiPanjang persegiP = new PersegiPanjang(10, 5);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(4, 6);

        System.out.println("===================================");
        System.out.println("| Persegi Panjang\t\t  |");
        System.out.println("===================================");
        System.out.println("| Luas Persegi Panjang: " + persegiP.luas() + "\t  |");
        System.out.println("| Keliling Persegi Panjang: " + persegiP.keliling() + " |");
        System.out.println("===================================");

        System.out.println("");
        System.out.println("===================================");
        System.out.println("| Lingkaran\t\t\t  |");
        System.out.println("===================================");
        System.out.println("| Luas Lingkaran: " + lingkaran.luas() + "\t  |");
        System.out.println("| Keliling Lingkaran: " + lingkaran.keliling() + "\t  |");
        System.out.println("===================================");

        System.out.println("");
        System.out.println("===================================");
        System.out.println("| Segitiga \t\t\t  |");
        System.out.println("===================================");
        System.out.println("| Luas Segitiga: " + segitiga.luas() + "\t\t  |");
        System.out.println("| Keliling Segitiga: " + segitiga.keliling() + "\t  |");
        System.out.println("===================================");

    }
}
