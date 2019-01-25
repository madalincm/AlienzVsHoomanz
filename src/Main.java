public class Main {

    public static void main(String[] args) {
        Warrior human1 = new Human();
        Warrior alien1 = new Alien();

        Warrior human2 = new Human();

        human1.attack(alien1);
        alien1.attack(human1);
    }
}
