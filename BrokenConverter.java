public class BrokenConverter {
    public static void main(String[] args) {
    double f = 100;
    double c = (f - 32) * 5/9; 
    System.out.printf( " %.2f °F = %.2f °C ",f,c);
    }
}
