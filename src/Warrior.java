/**
 * Created by madalin.cotetiu on 1/25/2019.
 */
public interface Warrior {
    boolean canAttack();
    boolean canBeAttacked();
    String performAttack(Warrior warrior);
    void dealWithAttack(int damage);
    void displayStats();
}
