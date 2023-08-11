package classExample2;

public class Circle {
  double radius;
  String color;

  public Circle() {
    this(1.0, "White"); // 아래 표기와 혼용 가능하지만, 최상단에 써야함
//    this.radius = 1.0;
//    this.color = "White";
  }
  public Circle(double radius) {
    this(radius, "White");
//    this.radius = radius;
//    this.color = "White";
  }
  public Circle(String color) {
    this.color = color;
    this.radius = 1.0;
  }
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }
}
