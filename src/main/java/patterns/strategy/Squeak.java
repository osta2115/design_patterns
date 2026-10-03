package patterns.strategy;

public class Squeak implements QuackInterface{
    @Override
    public void quack() {
        System.out.println("I'm squeaking");
    }
}
