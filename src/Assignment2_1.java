import java.util.Scanner;

public class Assignment2_1 {
    public static void main(String[] args) throws Exception {
        Scanner temp = new Scanner(System.in);

        System.out.print("This program converts a temperature in degrees Celsius into a temperature in degrees Fahrenheit. Enter a temperature in degrees Celsius: ");
        Double cel = temp.nextDouble();
        Double fahr = (9.0 / 5.0) * cel + 32;
        temp.close();

        System.out.println("\n" + cel + " degrees Celsius is equal to " + fahr + " degrees Fahrenheit.\n");
        System.out.println("Goodbye...");
    }
}
