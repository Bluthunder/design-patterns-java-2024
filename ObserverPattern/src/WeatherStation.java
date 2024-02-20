public class WeatherStation {
    public static void main(String[] args) {

        System.out.println("Hello world! \n"+ "Welcome to Weather Station !!");

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f );
        weatherData.setMeasurements(60,45,30.2f );
        weatherData.setMeasurements(40,35,29.4f );


    }
}