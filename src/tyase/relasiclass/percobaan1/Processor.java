package tyase.relasiclass.percobaan1;

public class Processor {
    private String merk;
    private double cache;

    Processor() {
        merk = "unknow";
        cache = 0;
    }

    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = 0;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String newMerk) {
        merk = newMerk;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double newCache) {
        cache = newCache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
