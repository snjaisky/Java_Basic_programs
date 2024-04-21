package Programs;

public class TemperatureConversion {
	 public static void main(String[] args) {
	        double celsius = 37;
	        double fahrenheit = (celsius * 9/5) + 32;
	        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");

	        double tempFahrenheit = 98.6;
	        double tempCelsius = (tempFahrenheit - 32) * 5/9;
	        System.out.println(tempFahrenheit + " Fahrenheit is equal to " + tempCelsius + " Celsius.");
	    }

}
