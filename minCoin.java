import java.util.Scanner;

public class minCoin {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] coins = new int[]{100, 25, 10, 5, 1};
    int[] amount = new int[coins.length];
    double total = input.nextDouble() * 100;
    int idx = 0;
    for (int i = 0; i < coins.length; i++) {
      amount[idx] = (int)(total / coins[i]);
      idx += 1;
      total = total % coins[i];
    }
    System.out.println(String.format("dollars: %d", amount[0]));
    System.out.println(String.format("quarters: %d", amount[1]));
    System.out.println(String.format("dimes: %d", amount[2]));
    System.out.println(String.format("nickle: %d", amount[3]));
    System.out.println(String.format("penny: %d", amount[4]));

  }
}
