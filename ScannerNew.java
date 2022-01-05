import java.util.Scanner;

// learn how to use Scanners in java

public class ScannerNew {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("What's your name?");
    String response = input.nextLine();
    // input.nextInt();
    // input.nextDouble();
    // input.nextBoolean();
    // input.nextFloat();
    System.out.println(String.format("Hello, %s", response));

  }
}
