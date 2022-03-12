public class MergeSort {

  public static void conquer(int[] arr, int[] temp, int start, int mid, int end) {
    int i = start; // lefthalf
    int j = mid+1; // righthalf
    int k = start;
    while (i <= mid && j <= end) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    while (i <= mid) {
      temp[k] = arr[i];
      i++;
      k++;
    }
    while (j <= end) {
      temp[k] = arr[j];
      j++;
      k++;
    }
    for (int z = start; z <= end; z++) {
      arr[z] = temp[z];
    }
  }

  public static void divide(int[] arr, int[] temp, int start, int end) {
    if (start < end) { // ensure it is splitable
      int mid = (start + end) / 2;
      divide(arr, temp, start, mid);
      divide(arr, temp, mid+1, end);
      conquer(arr, temp, start, mid, end);
    }
  }

  public static int[] mergeSort(int[] arr) {
    int[] temp = new int[arr.length];
    int start = 0;
    int end = arr.length -1;
    divide(arr, temp, start, end);
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {6, 2, 6, 4, 2, 2, 9, 1, 0, 8, 4, 5};
    System.out.println("Array before sort:");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();

    int[] out = mergeSort(arr);

    System.out.println("Array after sort:");
    for (int i : out) {
      System.out.print(i + " ");
    }
    System.out.println();

  }
}
