package lotr;

import java.util.Random;

public class CharacterFactory {
    private static final String[]  CHARACTER_CLASSES = {"Hobbit", "Elf", "Knight", "King"};
    Character createCharacter() {
        try {
            Random random = new Random();

            String randomCharacterType = CHARACTER_CLASSES[random.nextInt(CHARACTER_CLASSES.length)];

            Class<?> reClass = Class.forName("lotr." + randomCharacterType);

            if (Character.class.isAssignableFrom(reClass)) {
                return (Character) reClass.getDeclaredConstructor().newInstance();
            } else {
                throw new IllegalArgumentException("Not a Character");
            }
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Not a Class");
        } catch (Exception ex) {
            throw new RuntimeException("Something went wrong...");
        }

    }
}
