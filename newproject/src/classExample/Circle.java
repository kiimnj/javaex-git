package classExample;

public class Circle {
  private double radius;// private: 은닉

  public Circle() { // 컴파일러가 기본생성자 만들어줌
  }

  public Circle(double radius) { // 안만들어줌
    this.radius = radius;
  }

  // alt + insert
  public double getRadius() {
    return radius;
  }

  public double findArea() {
    return radius * radius * Math.PI;
  }

  public void setRadius(double radius) { // stack영역에 올라가고 없어지므로 변수명 radius 사용해도 ㅇ
    if (radius <= 0) { // 검증된 절차를 거쳐서 데이터를 수정하는 비지니스 로직
      System.out.println("원의 반지름은 0보다 커야합니다.");
    } else {
      this.radius = radius; // 전역 변수명과 같아서 radius = radius;는 불가
    }
  }
}
