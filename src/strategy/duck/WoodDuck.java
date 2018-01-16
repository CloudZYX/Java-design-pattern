package strategy.duck;

import strategy.fly.CanNotFly;
import strategy.sound.CanNotSound;

public class WoodDuck extends Duck {

    public WoodDuck(){
        this.flyBehavior = new CanNotFly();
        this.soundBehavior = new CanNotSound();
    }
}
