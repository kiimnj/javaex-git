package chapter05;

import classExample.Circle;

public class CallByRef {
  public static void main(String[] args) {
    Circle c1 = new Circle(10.0);
    Circle c2 = new Circle(10.0);

    zero(c1);
    System.out.println("메서트 실행 후 반지름 : " + c1.getRadius()); // c1.radius 하려면 radius가 public이어야

    zero(c2.getRadius());
    System.out.println(" 원 (c2) 의 반지름 : " + c2.getRadius());

  }
  public static void zero(Circle c) { // read write 가능 : c1의 인스턴스 변수를 가리킴
    c.setRadius(1.0); // c.radius = 1.0; 하려면 radius가 public이어야, 0.0으로는 수정 안되도록 막아둠
  }
  public static void zero(double r) { // 오버로딩, read만 가능 (지역변수 r만 write 가능)
    r = 1.0;
  }
}
