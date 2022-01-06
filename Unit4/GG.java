import java.util.Scanner;

// a number guessing game

public class GG {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int ans = (int)(Math.random() * 101);
    int g = -1;
    while (g != ans) {
      System.out.print("Guess a number: ");
      g = input.nextInt();
      if (g > ans) {
          System.out.println("Too high!");
      } else if (g < ans) {
          System.out.println("Too low!");
      }
    }
    System.out.println("You got it!");
  }
}
