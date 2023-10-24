package Tugas;

public class Mac extends Laptop {
    public String security;

    Mac() {
    }

    Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }

    public void tampilMac() {
        System.out.println("=================Data Mac=================");
        super.tampilLaptop();
        System.out.println("Security           =" + security);
    }
}
