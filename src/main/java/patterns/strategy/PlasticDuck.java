package patterns.strategy;

public class PlasticDuck extends Duck {

    public PlasticDuck() {
        quackInterface = new Squeak();
        flyInterface = new NotFly();
    }

    @Override
    public void display() {

    }

    @Override
    public void swim() {

    }
}
