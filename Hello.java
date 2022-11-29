/**
 * Hello
 */
public class Hello {

  public static void main(String[] args) {
    long longStr = 123456789;
    System.out.println(longStr);
    
    Integer i = new Integer(10);
    System.out.println(i instanceof Integer); // 知道类型名

    String parentClass = "java.lang.String";
    try {
        Class<?> clazz = Class.forName(parentClass);
        String str = new String("111");
        System.out.println(clazz);
        
        System.out.println(str.getClass().isInstance(clazz.newInstance())); // 不知道类型名，动态加载类型名
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
        e.printStackTrace();
    }
    String str = "222";
    System.out.println(str);
  }
}

