package strategy.duck;

import strategy.fly.CanNotFly;
import strategy.sound.SoundByguagua;

public class EraserDuck extends Duck {

    public EraserDuck(){
        this.flyBehavior = new CanNotFly();
        this.soundBehavior = new SoundByguagua();
    }
}
