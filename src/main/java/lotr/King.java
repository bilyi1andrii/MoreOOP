package lotr;
import java.util.Random;
import lotr.kickstrategy.KingKick;

public class King extends Character {
    public King() {
        super(5 + new Random().nextInt(11), 5 + new Random().nextInt(11), new KingKick());
    }
}
