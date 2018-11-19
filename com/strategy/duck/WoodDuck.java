package com.strategy.duck;

import com.strategy.fly.CanNotFly;
import com.strategy.sound.CanNotSound;

public class WoodDuck extends Duck {

    public WoodDuck(){
        this.flyBehavior = new CanNotFly();
        this.soundBehavior = new CanNotSound();
    }
}
