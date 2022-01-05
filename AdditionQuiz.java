import java.util.Scanner;

// Quiz for addition

public class AdditionQuiz {
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    int n1 = (int) (System.currentTimeMillis() % 10);
    int n2 = (int) (System.currentTimeMillis() / 10 % 10);
    int n3 = (int) (System.currentTimeMillis() / 100 % 10);

    System.out.println(String.format("%d + %d + %d = ? ", n1, n2, n3));
    int res = input.nextInt();
    System.out.println(String.format("%d + %d + %d = %d is %b ", n1, n2, n3, res, (n1 + n2 + n3 == res)));
  }
}
