package oberver;

public class CurrentDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public CurrentDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("temperature: " + temp);
        System.out.println("humidity: " + humidity);
        System.out.println("pressure: " + pressure);
    }
}
