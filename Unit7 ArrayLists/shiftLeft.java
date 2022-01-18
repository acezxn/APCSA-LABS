import java.util.ArrayList;

public class shiftLeft {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);
    // [1, 2, 3, 4, 5]

    // shift every array index left by one
    int last = arr.get(0);
    for (int i = 0; i < arr.size(); i++) {
      if (i == arr.size()-1) {
        arr.set(i, last);
      } else {
        arr.set(i, arr.get(i+1));
      }
    }

    System.out.println("new array:");
    System.out.println(arr);
  }
}
