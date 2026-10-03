package patterns.strategy;

public class NotQuack implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("I'm not quacking");
    }
}
