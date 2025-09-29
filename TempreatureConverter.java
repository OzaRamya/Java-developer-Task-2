import java.util.Scanner;

public class TempreatureConverter {

    static double fahrenheit;
    static double celsius;
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        // fixed conversion
            fahrenheit = 98.6;
            celsius = (fahrenheit - 32) * 5/9;
            System.out.printf(" %.2f Fahrenheit is equal to %.2f Celsius\n",fahrenheit,celsius);
        while (true) 
        {        
            // dynamic conversion 
            
            FahrenheitToCelcius();
        
            // reverse conversion
            CelsiusToFahrenheit();  

            // Fahrenheit to Kelvin
            FahrenheitToKelvin();
            System.out.print("Do you want convert more ? Y/N ");
            if (!s.next().equalsIgnoreCase("y")) {
                break;
            }

        }

        
        
    }
    public static void FahrenheitToCelcius()
    {
        System.out.print("Enter Fahrenheit : ");
        fahrenheit = s.nextDouble();
        // range check
        if(fahrenheit < -459.67)
        {
            System.out.println("Invalid input: Absolute zero exceeded");
        }
        else
        {
            celsius = (fahrenheit - 32) * 5/9;
            System.out.printf(" %.2f Fahrenheit is equal to %.2f Celsius\n",fahrenheit,celsius);
        }           
    }

    public static void CelsiusToFahrenheit()
    {
        System.out.print("Enter Celsius : ");
        celsius = s.nextDouble();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.printf(" %.2f Celsius is equal to %.2f Fahrenheit\n",celsius,fahrenheit);
    }

    public static void FahrenheitToKelvin()
    {
        System.out.print("Enter Fahrenheit : ");
        fahrenheit = s.nextDouble();
        double kelvin;
        kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.printf(" %.2f Fahrenheit is equal to %.2f Kelvin\n",fahrenheit,kelvin);
    }
}
