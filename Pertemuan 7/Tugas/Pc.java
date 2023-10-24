package Tugas;

public class Pc extends Komputer {
    int ukuranMonitor;

    Pc() {
    }

    Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor     =" + ukuranMonitor);
    }
}
