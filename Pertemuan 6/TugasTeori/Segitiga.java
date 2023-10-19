package TugasTeori;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return (alas * tinggi) / 2;
    }

    // segitiga biasanya tidak ada keliling. 0 untuk menandakan bahwa
    // segitiga tidak ada keliling
    public float keliling() {
        return 0;
    }
}
