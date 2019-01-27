/**
 * Created by madalin.cotetiu on 1/25/2019.
 */
public class Alien extends Creature implements Warrior{
    private int energy;
    private int dodge;

    public Alien() {
        this.setHealth(100);
        this.setAttackPower(20);
        this.energy = 130;
        this.setDead(false);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void calculateAtackPower(){
        if(this.energy <=49) {
            this.setAttackPower(5);
        } else if(this.energy <= 79) {
            this.setAttackPower(10);
        } else {
            this.setAttackPower(20);
        }
    }
    public boolean canAttack() {
        return ((this.energy != 0) && !this.isDead());
    }

    public boolean canBeAttacked(){
        return !this.isDead();
    }

    public void dealWithAttack(int damage) {
        this.setHealth(this.getHealth() - damage);
        if(this.getHealth() <= 0) {
            this.setDead(true);
        }
    }

    public String performAttack(Warrior warrior){
        if(this.canAttack()){
            if(warrior.canBeAttacked()){
                calculateAtackPower();
                warrior.dealWithAttack(this.getAttackPower());
                this.energy = this.energy - 10;
                return "Attack completed";
            } else {
                return "Target id dead";
            }
        } else {
            return "Alien can't attack";
        }
    }

    public void displayStats() {
        System.out.println("Stats for " + this.getId());
        System.out.println("Health: " + this.getHealth());
        System.out.println("Energy: " + this.energy);
        System.out.println("Attack power " + this.getAttackPower());
    }
}
