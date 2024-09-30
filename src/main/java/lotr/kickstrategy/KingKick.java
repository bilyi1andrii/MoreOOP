package lotr.kickstrategy;

import java.util.Random;
import lotr.Character;

public class KingKick implements KickStrategy {

    @Override
    public void kick(Character character, Character c) {
        Random random = new Random();

        c.setHp(c.getHp() - random.nextInt(character.getPower() + 1));

    }
}
