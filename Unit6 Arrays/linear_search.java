// java demostration of linear search

public class linear_search {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    int target = 5;
    int idx = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        idx = i;
        break;
      }
    }
    System.out.println("target " + target + " is at index " + idx);
  }
}
