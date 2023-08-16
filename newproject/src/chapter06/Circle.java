package chapter06;

public class Circle {
  double radius;
  static String color = "white";

  static void setRadius(String aaa) {
//    radius = radius; this 불가
    color = aaa;
  }

  final void changeRadius() { // final은 오버라이딩 - 상속 불가
    this.radius = radius;
  }
  private void secret() {
    System.out.println("비밀입니다.");
  }
  protected void findRadius() { // protected, public으로 오버라이딩 가능, 리턴 타입도 부모와 같아야
    System.out.println("반지름이 10.0입니다.");
  }
  
  public double findArea() {
    return Math.PI * radius * radius;
  }
}
