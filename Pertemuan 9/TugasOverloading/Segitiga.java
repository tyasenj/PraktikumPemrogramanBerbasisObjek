package TugasOverloading;

public class Segitiga {
    public int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c;
    }

    public void info() {
        System.out.println("Total sudut (sudutA): " + this.totalSudut(30));
        System.out.println("Total sudut (sudutA, sudutB): " + this.totalSudut(45, 75));
        System.out.println("Keliling (sisiA, sisiB, sisiC): " + this.keliling(20, 10, 15));
        System.out.println("Keliling (sisiA, sisiB): " + keliling(20, 12));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        segitiga.info();
    }
}
