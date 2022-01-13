import java.util.ArrayList;
// a demostration of java ArrayLists
public class Intro {
  public static void main(String[] args ) {
    // declare an ArrayList:
    ArrayList<String> arr_str = new ArrayList<>();
    ArrayList<String> arr_str1 = new ArrayList<String>();

    // declare an ArrayList with an unsafe method:
    ArrayList<String> arr_unsafe = new ArrayList();

    // ArrayList can only hold objects, but you can add primitive types in it by using wrapper classes:
    ArrayList<Integer> arr_int = new ArrayList<>();

    // ArrayLists starts at index 0, ends at index arr.size()-1. where as arr.size() returns the number of elements in it.

    /*
    add value:
    */
    // 1. append at the end of ArrayList
    arr_str.add("A");
    arr_str.add("B");
    arr_str.add("C");

    // 2. insert at a specific index
    arr_str.add(1, "B");

    // access the element in a specific index:
    int index = 1;
    System.out.println(arr_str.get(index));

    // get the number of elements in an array:
    System.out.println(arr_str.size());

    // assign value to a specific index of an ArrayList:
    arr_str.set(1, "X");

    // traversing the array
    // using loops:
    for (int i = 0; i < arr_str.size(); i++) {
      System.out.println(arr_str.get(i));
    }
    int i = 0;

    while (i < arr_str.size()) {
      System.out.println(arr_str.get(i));
      i++;
    }

    for (String e : arr_str) {
      System.out.println(e);
    }

    // remove value at a specific index: (arr_str.remove(index))
    arr_str.remove(0);

  }
}
