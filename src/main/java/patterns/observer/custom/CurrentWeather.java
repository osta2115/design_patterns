package patterns.observer.custom;

public class CurrentWeather implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Observable observable;

    public CurrentWeather(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current weather temperature: " + temp + " humidity: " + humidity + " pressure: " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
