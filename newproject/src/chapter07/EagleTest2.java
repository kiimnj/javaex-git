package chapter07;

public class EagleTest2 {
  //멤버 클래스
  ABird b = new ABird(){
    void fly(){
      System.out.println("독수리가 날아간다");
    }
  };

  //메서드
  public static void main(String[] args) {
    EagleTest2 eagleTest2 = new EagleTest2();
    eagleTest2.b.fly();
  }
}

