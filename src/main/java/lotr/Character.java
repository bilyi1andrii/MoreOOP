package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotr.kickstrategy.KickStrategy;


@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

    public void setHp(int hp) {
        this.hp = hp < 0 ? 0 : hp;
    }

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }

    boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp="+ hp + ", power=" + power + "}";
    }
}
