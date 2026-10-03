package patterns.strategy;

public class Quack implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("I'm quacking");
    }
}
