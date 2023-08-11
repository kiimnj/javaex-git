package challangeCh4;

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public Person setName(String name) { // void X, 체이닝 하기 위함: return 타입을 객체로
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  public void sayHello() {
    System.out.println(age + "살" + name + "입니다.");
  }
}
