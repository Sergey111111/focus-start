package oberver;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        CurrentDisplay  display =  new CurrentDisplay(data);
        data.setData(20, 30, 40);
    }
}
