package Tugas;

public class Windows extends Laptop {
    String fitur;

    Windows() {
    }

    Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        System.out.println("=================Data Windows=================");
        super.tampilLaptop();
        System.out.println("Fitur              =" + fitur);
    }
}
