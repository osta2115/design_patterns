package patterns.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        Duck plasticDuck = new PlasticDuck();
        Duck mallardDuck = new MallardDuck();
        Duck modelDuck = new ModelDuck();

        System.out.println("Wild Duck");
        wildDuck.quack();
        wildDuck.fly();
        System.out.println("Plastic Duck");
        plasticDuck.quack();
        plasticDuck.fly();
        System.out.println("Mallard Duck");
        mallardDuck.quack();
        mallardDuck.fly();
        System.out.println("Model Duck");
        modelDuck.quack();
        modelDuck.fly();
        System.out.println("Model Duck - setting flying");
        modelDuck.setFlyInterface(new Fly());
        modelDuck.fly();
    }
}
