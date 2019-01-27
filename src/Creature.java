import java.util.UUID;

/**
 * Created by madalin.cotetiu on 1/25/2019.
 */
public class Creature {
    private int health;
    private boolean isDead;
    private int attackPower;
    private String id;

    public Creature() {
        this.isDead = false;
        this.id = UUID.randomUUID().toString();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getId() {
        return id;
    }

    public void kill() {
        this.health = 0;
        this.isDead = true;
    }
}
