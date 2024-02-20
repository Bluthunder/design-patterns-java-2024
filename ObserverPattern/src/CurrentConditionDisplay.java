public class CurrentConditionDisplay implements Observer,DisplayElement{

    private Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + " F degrees " + humidity + "% humidity and "
                + pressure + " f");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
