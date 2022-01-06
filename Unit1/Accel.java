import java.util.Scanner;

// calculate average acceleration

public class Accel {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter v0, v1, and t: ");
    double v0 = input.nextDouble();
    double v1 = input.nextDouble();
    double t = input.nextDouble();
    double a = ((v1 - v0) / t);

    System.out.println(String.format("The average acceleration is %.4f", a));
  }
}
