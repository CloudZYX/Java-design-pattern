package com.strategy.duck;

import com.strategy.fly.FlyBehavior;
import com.strategy.fly.FlyByRocket;
import com.strategy.sound.SoundBehavior;

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

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public SoundBehavior getSoundBehavior() {
        return soundBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }


    public static void  main(String[] args){
        CommonDuck duck1 = new CommonDuck();
        WoodDuck duck2 = new WoodDuck();
        EraserDuck duck3 = new EraserDuck();

        duck1.fly();
        duck1.sound();
        duck2.fly();
        duck2.sound();
        duck3.fly();
        duck3.sound();

        duck2.setFlyBehavior(new FlyByRocket());
        duck2.fly();
    }
}
