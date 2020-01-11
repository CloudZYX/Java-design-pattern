package com.strategy;

import com.strategy.duck.CommonDuck;
import com.strategy.duck.Duck;
import com.strategy.duck.EraserDuck;
import com.strategy.duck.WoodDuck;

public class Main {

    public static void main(String[] args) {
        //普通鸭子
        Duck duck1 = new CommonDuck();
        System.out.println("普通鸭子的行为：");
        duck1.sound();
        duck1.fly();

        //橡皮鸭子
        Duck duck2 = new EraserDuck();
        System.out.println("橡皮鸭子的行为：");
        duck2.sound();
        duck2.fly();

        //木头鸭子
        Duck duck3 = new WoodDuck();
        System.out.println("木头鸭子的行为：");
        duck3.sound();
        duck3.fly();

    }
}
