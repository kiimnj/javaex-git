package challangeCh4;

public class MemberTest {
  public static void main(String[] args) {
    Member m  = new Member("홍길동", "hongkd", "1234", 130);
    m.setAge(20);
    System.out.printf("%s의 나이는 %d입니다.", m.getName(), m.getAge());
  }
}
