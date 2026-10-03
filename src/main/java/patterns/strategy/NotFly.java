package patterns.strategy;

public class NotFly implements FlyInterface{
    @Override
    public void fly() {
        System.out.println("I'm not flying");
    }
}
