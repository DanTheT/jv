/**
 * main
 */
public class converter {

    public static void main(String[] args) {

        double outputFahrenheit = CelciusToFahrenheit(11.1);
        double outputCelcius = FahrenheitToCelcius(51.98);
        
        System.out.println("Celcius to Fahrenheit \n" + String.format("%.2f", outputFahrenheit));
        System.out.println("Fahrenheit to Celcius \n" + String.format("%.2f", outputCelcius));
    }

    static double CelciusToFahrenheit(double inputCelcius) {
        final double constDivide = 9.0/5.0;

        return ((inputCelcius * (constDivide)) + 32);
    }

    static double FahrenheitToCelcius(double inputFahrenheit) {
        final double constMultiple = 5.0/9.0;

        return ((inputFahrenheit - 32) * constMultiple);
    }
}