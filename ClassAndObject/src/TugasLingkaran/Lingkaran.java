package TugasLingkaran;

public class Lingkaran {
    public double phi;
    public double r;

    public void hitungLuas() {
        double luasLingkaran = phi * r * r;
        System.out.println("Luas lingkaran     : " + luasLingkaran);
    }

    public void hitungKeliling() {
        double kelilingLingkaran = 2 * phi * r;
        System.out.println("Keliling lingkaran : " + kelilingLingkaran);
    }

    public void tampilLingkaran() {
        System.out.println("phi                : " + phi);
        System.out.println("r                  : " + r);
    }
}
