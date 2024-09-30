package lotr.kickstrategy;

import lotr.Character;

public class ElfKick implements KickStrategy {

    @Override
    public void kick(Character character, Character c) {
        if (character.getPower() > c.getPower())
            c.setHp(0);

        else
            character.setPower(character.getPower() - 1);


    }
}
