package Tugas;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        if (level == 1) {
            health += health * 0.2; // Penyembuhan 20% dari health awal
        } else if (level == 2) {
            health += health * 0.3; // Penyembuhan 30% dari health awal
        } else if (level == 3) {
            health += health * 0.4; // Penyembuhan 40% dari health awal
        }
    }

    public void destroyed() {
        health -= health * 0.19; // Pengurangan 2% dari health
    }

    public String getZombieInfo() {
        System.out.println("Walking Zombie Data = ");
        return "Health: " + health + "\nLevel: " + level + "\n";
    }

}
