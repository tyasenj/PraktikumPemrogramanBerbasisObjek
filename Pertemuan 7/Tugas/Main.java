package Tugas;

public class Main {
    public static void main(String[] args) {
        Komputer kmp = new Komputer("Samsung", 4, 32, "Intel");
        kmp.tampilData();

        // Laptop lp = new Laptop("Asus", 3, 16, "Intel Core i9 X Series",
        // "Lithium-Ion");
        // lp.tampilLaptop();

        // Pc pc = new Pc("Hp", 4, 64, "Intel", 24);
        // pc.tampilPc();

        Mac mc = new Mac("MacBook Air", 3, 16, "Intel Core i5 quad-core ",
                "Lithium-io", "Chip Apple T2");
        mc.tampilMac();

        Windows wd = new Windows(" Acer Spin 1", 4, 32, "Core i7",
                "Aspire E1", "OS Windows");
        wd.tampilWindows();
    }
}
