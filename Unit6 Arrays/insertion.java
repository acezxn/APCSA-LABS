// implementation of insertion sort in java

public class insertion {
    public static void main(String[] args) {
        int[] input = { 2, 1, 6, 0, 8, 9, 5, 3, 3 };
        System.out.print("Array before sort: \t");
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 1; i < input.length; i++) {
            int current_idx = i;
            int src = input[current_idx];
            while (current_idx > 0 && src < input[current_idx - 1]) {
                input[current_idx] = input[current_idx - 1];
                current_idx--;
            }
            input[current_idx] = src;
        }

        System.out.print("Array after sort: \t");
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

    }
}
