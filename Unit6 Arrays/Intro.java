
// a demostration of java arrays
public class Intro {
  public static void main(String[] args ) {
    // declare an array with specific elements
    int[] arr1 = {1, 2, 3};

    // declare an array with specific size
    int[] arr2 = new int[3];
  // ^ this part can be changed to any type that yow wish to include in the array.
    // this method will create an array with size 3 with the default value of the datatype.

    // or you can declare an array by this:
    int[] arr3 = new int[]{1, 2, 3};

    // array starts at index 0, ends at index arr.length-1.

    // access the element in a specific index:
    int index = 1;
    System.out.println(arr1[index]);

    // get the number of elements in an array:
    System.out.println(arr2.length);

    // assign value to a specific index of an array:
    arr1[1] = 10;

    // traversing the array
    // using loops:
    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }
    int i = 0;

    while (i < arr3.length) {
      System.out.println(arr3[i]);
      i++;
    }

    for (int e : arr3) {
      System.out.println(e);
    }
  }
}
