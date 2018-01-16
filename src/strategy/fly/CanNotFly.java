package strategy.fly;

public class CanNotFly extends FlyBehavior {

    @Override
    public void fly(){
        System.out.println("I can't fly");
    }
}
