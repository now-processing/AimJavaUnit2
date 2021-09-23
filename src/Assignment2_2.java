import java.util.Scanner;

public class Assignment2_2 {
    static int days;
    public static void main(String[] args) {
        int[] monthNoFeb = {1,3,4,5,6,7,8,9,10,11,12};
        String[] monthName = {"January","February","March","April","May","June","July","August","September","October", "November","December"};

        Scanner input = new Scanner(System.in);

        System.out.println("Given a year and a month in that year, this program will tell you the number of days in that month.");
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();        

        System.out.print("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        int monthInt = input.nextInt();
        input.close();

        if (monthInt < 1 || monthInt > 12) {
            System.out.println(days + " is invalid. Month values must be between 1 and 12, inclusive.\nGoodbye ...");
        }

        if (monthInt == 2 && year % 4 == 0 || year % 400 == 0) {
            days = 29;
        } else {
            days = 28;
        }

        if (monthInt != 2) {
            for (int x : monthNoFeb) {
                if (x == monthInt && monthInt < 8 && monthInt % 2 != 0) {
                    days = 31;
                    break;
                } else if (x == monthInt && monthInt > 7 && monthInt % 2 == 0) {
                    days = 31;
                    break;
                } else {
                    days = 30;
                }
            }
        }
        System.out.println(monthName[monthInt-1] + " of " + year + " has " + days + " days in it.\nGoodbye ...");
        
    }
}
