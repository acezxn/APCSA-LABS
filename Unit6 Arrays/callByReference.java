// Call by reference with arrays

/*
Call by reference is a type of calling method which pass addresses refering to the original objects.
As the former parameter in the method header aliased with the actual parameter that is passed in,
the parameter value can be changed without re-initializing the variable.

In java, arrays are objects, thus this property applies.
*/
public class callByReference {
  public static void modify(String[] a) {
    a[1] = "wow";
  }

  public static void main(String[] args) {
    String[] arr = {"hello", "yeah", "no"};
    System.out.println("Before change:");
    for (String s : arr) {
      System.out.print(s + " ");
    }
    System.out.println();
    modify(arr);
    System.out.println("After change:");
    for (String s : arr) {
      System.out.print(s + " ");
    }
    System.out.println();
  }
}
