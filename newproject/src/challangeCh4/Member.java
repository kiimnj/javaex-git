package challangeCh4;

public class Member {
  // 필드
  private String name;
  private String id;
  private String pw;
  private int age;

  //생성자(모든 회원정보 사용)
  public Member(String name, String id, String password, int age) {
    this.name = name;
    this.id = id;
    this.pw = pw;
    this.age = age;
  }

  // 접근자
  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public String getPw() {
    return pw;
  }

  public int getAge() {
    return age;
  }

  // 설정자
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if (age < 0 || age > 120) {
      System.out.println("나이 입력 오류");
      return;
    }
    this.age = age;
  }
}
