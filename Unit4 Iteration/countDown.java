import java.util.Scanner;

// learn while loops in java
public class countDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int i = input.nextInt();
        while (i >= 0) {
            System.out.print(i + " ");
            i -= 1;
        }
    }
}
