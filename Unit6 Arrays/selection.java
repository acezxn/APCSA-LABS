// implementation of selection sort in java

public class selection {
    public static void main(String[] args) {
        int[] input = { 2, 1, 6, 0, 8, 9, 5, 3, 3 };
        System.out.print("Array before sort: \t");
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        for (int z = 0; z < input.length - 1; z++) {
            int minIdx = z;
            for (int i = z+1; i < input.length; i++) {
                if (input[i] < input[minIdx]) {
                    minIdx = i;
                }
            }
            if (z != minIdx) {
              int tmp = input[z];
              input[z] = input[minIdx];
              input[minIdx] = tmp;
            }
        }
        System.out.print("Array after sort: \t");
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
