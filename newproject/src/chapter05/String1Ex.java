package chapter05;

public class String1Ex {
  public static void main(String[] args) {
    // ctrl+sh+en : 문장 자동 완성

    String s1;
    s1 = "안녕, 자바"; // 리터럴이 아니라 주소 할당 0x100
    String s2 = "안녕, 자바"; // 0x100 - 값이 같으면 있던 객체 사용
    String s3 = new String("안녕, 자바"); // 새로운 객체 생성 - 주소 다름. s3 = s1 - 같아짐, s3값 버려짐
    System.out.println(s1 == s2); // 주소값 비교
    System.out.println(s1.equals(s2)); // 리터럴 비교

    int i1 = 10;
    int i2 = 10;
    System.out.println(i1 == i2);
  }
}
