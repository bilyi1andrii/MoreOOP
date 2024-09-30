package lotr;

import java.util.Random;
import lotr.kickstrategy.KingKick;

public class Knight extends Character {
    public Knight() {
         super(2 + new Random().nextInt(11), 2 + new Random().nextInt(11), new KingKick());
    }
}
