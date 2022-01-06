public class hello_world_1_2 {

  public static void hello_world() {
    System.out.println("Hello World!");
  }

  public static void hello_world_2() {
    String name = "Daniel";
    int age = 17;
    double temperature = 36.5;
    boolean breaktime = false;

    System.out.println(String.format("My name is %s", name));
    System.out.println(String.format("I am %d years old", age));
    System.out.println(String.format("My temperature this morning is %f", temperature));
    System.out.println(String.format("It is breaktime now: %b", breaktime));


  }

  public static void operation() {
    int a = 4;
    int b = 2;
    float c = 5;
    int d = 3;
    System.out.println("a + b = " + (a+b));
    System.out.println("a - b = " + (a-b));
    System.out.println("a * b = " + (a*b));
    System.out.println("b / a = " + (b/a));
    System.out.println("a / c = " + (a/c));
    System.out.println("b % a = " + (b%a));
    System.out.println("c % a = " + (c%a));
  }


  public static void main(String[] args) {
    hello_world(); // first hello_world
    hello_world_2(); // second hello_world
    operation(); // operators practice
  }
}
