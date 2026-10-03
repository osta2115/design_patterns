package patterns.strategy;

public abstract class Duck {

    FlyInterface flyInterface;
    QuackInterface quackInterface;

    public abstract void display();

    public void fly() {
        flyInterface.fly();
    }

    public void quack() {
        quackInterface.quack();
    }

    public abstract void swim();

    public void setFlyInterface(FlyInterface flyInterface) {
        this.flyInterface = flyInterface;
    }

    public void setQuackInterface(QuackInterface quackInterface) {
        this.quackInterface = quackInterface;
    }
}
