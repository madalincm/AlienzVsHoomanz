import java.sql.SQLOutput;

/**
 * Created by madalin.cotetiu on 1/25/2019.
 */
public class Human extends Creature implements Warrior {
    private int ammo;
    private int armor;

    public Human() {
        this.setHealth(100);
        this.setAttackPower(15);
        this.ammo = 200;
        this.setDead(false);
        this.armor = 10;

    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public boolean canAttack() {
        return ((this.ammo != 0) && !this.isDead());
    }

    public boolean canBeAttacked() {
        return !this.isDead();
    }

    public void dealWithAttack(int damage) {
        this.setHealth(this.getHealth() - (damage - this.armor * 0.1f));
        if (this.getHealth() <= 0) {
            this.setDead(true);
        }
    }

    public String performAttack(Warrior warrior) {
        if (this.canAttack()) {
            if (warrior.canBeAttacked()) {
                warrior.dealWithAttack(this.getAttackPower());
                this.ammo = this.ammo - 15;
                return "Attack completed";
            } else {
                return "Target id dead";
            }
        } else {
            return "Human can't attack";
        }
    }

    public void displayStats() {
        System.out.println("Stats for " + this.getId());
        System.out.println("Health: " + this.getHealth());
        System.out.println("Ammo: " + this.ammo);
        System.out.println("Attack power: " + this.getAttackPower());
        System.out.println("Dead: " + this.isDead());
    }
}
