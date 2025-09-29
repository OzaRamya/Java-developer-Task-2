class Temperature {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public Temperature(double fahrenheit) {
    this.celsius = (fahrenheit - 32) * 5/9;
    this.kelvin = (fahrenheit - 32) * 5/9 + 273.15;
    this.fahrenheit = (this.celsius * 9/5) + 32;
    System.out.printf("Celsius : %.2f  \n Kelvin : %.2f \n Fahrenheit : %.2f ",this.celsius,this.kelvin,this.fahrenheit);
    }
    
}

public class Temp {
    public static void main(String[] args) {
        Temperature t = new Temperature(98.6);
    }
}
