package patterns.strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackInterface = new NotQuack();
        flyInterface = new NotFly();
    }

    @Override
    public void display() {

    }

    @Override
    public void swim() {

    }
}
