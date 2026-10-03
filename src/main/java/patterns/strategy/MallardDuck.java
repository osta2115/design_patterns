package patterns.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
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
