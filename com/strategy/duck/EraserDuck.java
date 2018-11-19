package com.strategy.duck;

import com.strategy.fly.CanNotFly;
import com.strategy.sound.SoundByguagua;

public class EraserDuck extends Duck {

    public EraserDuck(){
        this.flyBehavior = new CanNotFly();
        this.soundBehavior = new SoundByguagua();
    }
}
