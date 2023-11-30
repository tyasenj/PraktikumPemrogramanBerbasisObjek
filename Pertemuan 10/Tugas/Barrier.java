package Tugas;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroy() {
    }

    public String getBarrierInfo() {
        return "Barrier Strenght = " + strength;
    }

    @Override
    public void destroyed() {
        strength -= strength * 0.1;
    }

}
