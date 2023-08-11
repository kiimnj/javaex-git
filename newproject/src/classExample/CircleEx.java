package classExample;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle();// new: heap 영역에 올라감
    circle.setRadius(10.0); // 은닉 시키지 않을 경우 circle.radius로 접근 제어 가능
    circle.setRadius(-10.0); // 바뀌지 않아야 함
    System.out.println("circle의 반지름 = " + circle.getRadius());
    System.out.printf("circle의 넓이 = %.2f", circle.findArea(Circle.radius));
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

  public double findArea(double radius) {
    return (radius*radius)*Math.PI;
  }


  public void setRadius(double radius) { // stack영역에 올라가고 없어지므로 변수명 radius 사용해도 ㅇ
    if (radius <= 0) { // 검증된 절차를 거쳐서 데이터를 수정하는 비지니스 로직
      System.out.println("원의 반지름은 0보다 커야합니다.");
    } else {
      this.radius = radius; // 전역 변수명과 같아서 radius = radius;는 불가
    }
  }


  public class UseCircle {
    public static void main(String[] args) {
      Circle c1 = new Circle(20.0);
//      c.setRadius(20.0);
      System.out.println("c1.getRadius() = " + c1.getRadius());

      Circle c2 = new Circle(20.0);
      c2.setRadius(30.0);
      System.out.println("c2 = " + c2);
    }

    // c1 = c2 -> c2주소가 대입
  }
}