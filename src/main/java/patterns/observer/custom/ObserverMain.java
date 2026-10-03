package patterns.observer.custom;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentWeather currentWeather = new CurrentWeather(weatherData);

        weatherData.setData(26.6f, 65, 1013.1f);
    }
}
