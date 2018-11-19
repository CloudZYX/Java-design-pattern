package com.strategy.duck;

import com.strategy.fly.FlyByWing;
import com.strategy.sound.SoundBygaga;

public class CommonDuck extends Duck {

    public CommonDuck(){
        this.flyBehavior = new FlyByWing(); //通过翅膀飞
        this.soundBehavior = new SoundBygaga(); //嘎嘎叫
    }
}
