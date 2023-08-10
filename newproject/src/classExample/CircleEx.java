package classExample;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle();// new: heap 영역에 올라감
    circle.setRadius(10.0); // 은닉 시키지 않을 경우 circle.radius로 접근 제어 가능
    System.out.println("circle = " + circle.getRadius());
  }
}

class Circle {
  private double radius = 0.0; // private: 은닉, 기본이므로 뒤에 D 안 붙여도 ㅇ


  public Circle() { // 컴파일러가 기본생성자 만들어줌
  }

  public Circle(double radius) { // 안만들어줌
    this.radius = radius;
  }


  // alt + insert
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) { // stack영역에 올라가고 없어지므로 변수명 radius 사용해도 ㅇ
    this.radius = radius; // radius = radius;는 불가
  }


  public class UseCircle {
    public static void main(String[] args) {
      Circle c = new Circle(20.0);
//      c.setRadius(20.0);
      System.out.println("c.getRadius() = " + c.getRadius());

      Circle c2 = new Circle(20.0);
      c.setRadius(30.0);
    }
  }
}