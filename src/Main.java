public class Main {

    public static void main(String[] args) {
        Human human1 = new Human();
        Alien alien1 = new Alien();

        Human human2 = new Human();
        System.out.println(alien1.performAttack(human2));
        System.out.println(alien1.performAttack(human2));
        System.out.println(alien1.performAttack(human2));
        System.out.println(alien1.performAttack(human2));
        System.out.println(alien1.performAttack(human2));
        System.out.println(alien1.performAttack(human2));
        human2.displayStats();

        System.out.println(alien1.performAttack(human2));
        System.out.println(human2.performAttack(alien1));

        System.out.println(human1.performAttack(alien1));
        System.out.println(human1.performAttack(alien1));
        System.out.println(human1.performAttack(alien1));
        System.out.println(human1.performAttack(alien1));
        System.out.println(human1.performAttack(alien1));
        System.out.println(human1.performAttack(alien1));
        System.out.println(human1.performAttack(alien1));
        System.out.println(human1.performAttack(alien1));
        alien1.displayStats();

    }
}
