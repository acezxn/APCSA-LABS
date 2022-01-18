import java.util.ArrayList;

// remove elements from ArrayList algorithm
public class removeElement {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("apple");
    arr.add("orange");
    arr.add("computer");
    arr.add("cherry");
    arr.add("computer");
    arr.add("computer");
    arr.add("banana");
    String target = "computer";

    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i).equals(target)) {
        arr.remove(i);
        i--;
      }
    }
    System.out.println(arr);
  }
}
