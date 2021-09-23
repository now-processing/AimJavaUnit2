//import javax.print.event.PrintJobListener;

public class Assignment2_3 {
    public static void main(String[] args) {
        System.out.println("This program is going to convert kilograms to pounds(up to 15 kilograms).");
        System.out.println("Kilograms\tPounds");
        System.out.println("---------\t------");
        for (double kilo = 1; kilo <= 15; kilo = kilo + 2) {
            double pounds = kilo * 2.2;
            System.out.printf("%.0f\t\t%.2f\n", kilo, pounds);
        }
        System.out.println("Goodbye ...");
    }
}
