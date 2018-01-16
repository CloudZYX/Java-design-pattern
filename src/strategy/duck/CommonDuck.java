package strategy.duck;

import strategy.fly.FlyByWing;
import strategy.sound.SoundBygaga;

public class CommonDuck extends Duck {

    public CommonDuck(){
        this.flyBehavior = new FlyByWing(); //通过翅膀飞
//        this,soundBehavior = new SoundBygaga(); //嘎嘎叫
    }
}
