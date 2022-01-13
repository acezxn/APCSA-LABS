// implementation of binary search in java

public class binary_search {

    public static int search(int[] input, int target) {
        int idx = 0; // index for guessing
        int lb = 0; // lowest possible value for searching
        int rb = input.length - 1; // greatest possible value for searching
        while (lb <= rb) {
            idx = (lb + rb) / 2;
            if (input[idx] > target) { // if the guess is too large, set the greatest bound to the index -1.
                rb = idx - 1;
            } else if (input[idx] < target) { // if the guess is too small, set the lowest bound to the index +1.
                lb = idx + 1;
            } else {
                return idx;
            }

        }
        return -1;
    }

    // recursion method to binary search
    public static int recursive(int[] input, int target, int lb, int rb) {
        int idx = (lb + rb) / 2;
        if (lb > rb) {
            return -1;
        }
        if (input[idx] > target) {
            return recursive(input, target, lb, idx - 1);
        } else if (input[idx] < target) {
            return recursive(input, target, idx + 1, rb);
        } else {
            return idx;
        }
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int target = 9;
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Running binary search with loop method:");
        int res = search(input, target);
        System.out.println("target " + target + " is at index " + res);
        System.out.println();
        System.out.println("Running binary search with recursion method:");
        System.out.println("target " + target + " is at index " + recursive(input, target, 0, 12));

    }
}
