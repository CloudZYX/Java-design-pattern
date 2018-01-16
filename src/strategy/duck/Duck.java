package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.sound.SoundBehavior;

//@Data
public class Duck {
    protected FlyBehavior flyBehavior;
    protected SoundBehavior soundBehavior;

    public void sound(){
        this.soundBehavior.sound();
    }

    public void fly(){
        this.flyBehavior.fly();
    }

}
