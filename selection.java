// implementation of selection sort in java

public class selection {
    public static void main(String[] args) {
        int[] input = { 2, 1, 6, 0, 8, 9, 5, 3, 3 };
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        for (int z = 0; z < input.length - 1; z++) {
            int minIdx = z;
            for (int i = z; i < input.length; i++) {
                if (input[i] < input[minIdx]) {
                    minIdx = i;
                }
            }
            int tmp = input[z];
            input[z] = input[minIdx];
            input[minIdx] = tmp;
        }
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
