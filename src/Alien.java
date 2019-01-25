/**
 * Created by madalin.cotetiu on 1/25/2019.
 */
public class Alien extends Creature implements Warrior{
    private int energy;

    public Alien() {
        this.setHealth(200);
        this.setAttackPower(20);
        this.energy = 100;
        this.setDead(false);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void attack(){
        System.out.println("I am attacking now");
    }
}
