package patterns.strategy;

public class WildDuck extends Duck {

    public WildDuck() {
        quackInterface = new Quack();
        flyInterface = new Fly();
    }

    @Override
    public void display() {

    }

    @Override
    public void swim() {

    }
}
