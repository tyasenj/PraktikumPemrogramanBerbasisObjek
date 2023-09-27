package tyase.relasiclass.percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;

    Laptop() {
    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String newMerk) {
        merk = newMerk;
    }

    public Processor getProc() {
        return proc;
    }

    public void setProc(Processor newProc) {
        proc = newProc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
