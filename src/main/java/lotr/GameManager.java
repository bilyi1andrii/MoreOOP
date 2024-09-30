package lotr;

import java.util.Random;

public class GameManager {

    private int turnNumber = 1;
    private Random random = new Random();

    public void fight(Character c1, Character c2) {

        int randomNumber = random.nextInt(2) + 1;
        Character white;
        Character black;

        white = (randomNumber == 1) ? c1 : c2;
        black = (randomNumber == 1) ? c2: c1;

        System.out.println(white.getClass().getSimpleName() + " goes first!");

        while (c1.getHp() > 0 && c2.getHp() > 0) {
            System.out.println("Turn number: " + turnNumber);
            System.out.println(white.getClass().getSimpleName() + " attacks " + black.getClass().getSimpleName());
            white.kick(black);

            if (black.isAlive()) {
                System.out.println(black.getClass().getSimpleName() + " attacks " + white.getClass().getSimpleName());
                black.kick(white);
            }

            System.out.println("Current Status: " + white + " | " + black);

            turnNumber++;

        }

        if (c1.getHp() <= 0) {
            System.out.println(c1.getClass().getSimpleName() + " is defeated!");
            System.out.println(c2.getClass().getSimpleName() + " wins! After " + turnNumber + " turns");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " is defeated!");
            System.out.println(c1.getClass().getSimpleName() + " wins! After " + turnNumber + " turns");
        }

    }

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        // Example usage
        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();

        GameManager gm = new GameManager();
        gm.fight(c1, c2);
    }
}
