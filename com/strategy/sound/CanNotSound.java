package com.strategy.sound;

public class CanNotSound extends SoundBehavior {

    @Override
    public void sound(){
        System.out.println("I can't talk");
    }
}
