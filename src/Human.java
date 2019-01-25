/**
 * Created by madalin.cotetiu on 1/25/2019.
 */
public class Human extends Creature implements Warrior{
    private int ammo;

    public Human() {
        this.setHealth(100);
        this.setAttackPower(15);
        this.ammo = 200;
        this.setDead(false);
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public void attack(Warrior warrior){
        System.out.println("I am attacking now");
    }
}
