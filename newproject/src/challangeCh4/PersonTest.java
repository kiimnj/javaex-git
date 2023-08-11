package challangeCh4;

public class PersonTest {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("민국").setAge(21).sayHello(); // 체이닝은 결과값이 있을 때 가능
    Person p2 = new Person();
    p2.setName("대한").setAge(21).sayHello();
  }
}
