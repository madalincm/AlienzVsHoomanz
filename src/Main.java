public class Main {

    public static void main(String[] args) {
        Human human1 = new Human();
        Alien alien1 = new Alien();

        human1.displayStats();
        alien1.displayStats();
        System.out.println(alien1.performAttack(human1));
        human1.displayStats();
        alien1.displayStats();

        System.out.println(human1.performAttack(alien1));
        System.out.println(human1.performAttack(alien1));
        human1.displayStats();
        alien1.displayStats();
    }
}
