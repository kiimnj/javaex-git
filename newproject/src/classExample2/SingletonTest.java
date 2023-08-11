package classExample2;

public class SingletonTest {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance(); // new X: 생성자가 private이니까
    Singleton singleton2 = Singleton.getInstance(); // 위 객체와 동일

    System.out.println(singleton1);
    System.out.println(singleton2); // 동일함 확인
  }
}