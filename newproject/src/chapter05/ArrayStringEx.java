package chapter05;

public class ArrayStringEx {
  public static void main(String[] args) {
    String[] names = new String[3]; // 참조형 변수: null로 초기화
    for (String name : names) {
      System.out.println(name);
    }
    names[0] = "kim";
    names[1] = "lee";
    names[2] = "park";
    for (String name : names) { // String: return this라서 주소가 아닌 리터럴값 반환
      System.out.println(name);
    }
  }
}
