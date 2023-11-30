package Tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        if (level == 1) {
            // Jika level zombie adalah 1, tambahkan 30% dari health
            health += (int) (0.3 * health);
        } else if (level == 2) {
            // Jika level zombie adalah 2, tambahkan 40% dari health
            health += (int) (0.4 * health);
        } else if (level == 3) {
            // Jika level zombie adalah 3, tambahkan 50% dari health
            health += (int) (0.5 * health);
        }
    }

    public void destroyed() {
        // Setiap kali penghancuran, health berkurang 1%
        health -= (int) (1.906 * health);
    }

    public String getZombieInfo() {
        System.out.println("Jumping Zombie Data = ");
        String Zombieinfo = "Health: " + health + "\nLevel: " + level + "\n";
        return Zombieinfo;
    }
}
