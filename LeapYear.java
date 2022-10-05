import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        String result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (year % 100 == 0) {
            if (year % 400 ==0) {
                result = "Leap year";
            } else {
                result = "Not a leap year";
            }
        } else {
            if (year % 4 == 0) {
                result = "Leap year";
            } else {
                result = "Not a leap year";
            }
        }

        System.out.println(result);
    }
}
