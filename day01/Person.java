package day01;

public class Person {
  private String name;
  
  private int age;
  
  private int gender;
  
  public String getName() {
    return name;
  }
  
  public Number getAge() {
    return age;
  }
  
  public String getGender() {
    return gender == 0 ? "man" : "woman";
  }

  public void work() {
    if(18<= age && age <= 50) {
      System.out.println(name + " is working very hard!");
    } else {
      System.out.println(name + " can't work any more!");
    }
  }
}