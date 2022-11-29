package day01;

public class Demo {

  public static void main(String[] args) {
    // Integer x = 1;
    // int y = x;

    // System.out.println("x --> " + x);
    // System.out.println("y --> " + y);

    Integer x = new Integer(111);

    Integer y = new Integer(123);

    System.out.println(x == y); // false

    Integer z = Integer.valueOf(123);
    Integer k = Integer.valueOf(123);

    System.out.println(z == k); // true
  }
}
