package patterns.strategy;

public class Fly implements FlyInterface{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
