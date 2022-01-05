import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    boolean isLeapYear = false;

    if (year >= 0) {
        if (year % 4 == 0 && year % 100 != 0) {
            isLeapYear = true;
        }
        else if (year % 400 == 0) {
            isLeapYear = true;
        }
    }

    System.out.println(String.format("%d is a leap year? %b", year, isLeapYear));
  }
}
