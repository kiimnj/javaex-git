package challangeCh4;

public class Circle {
  // static, class 변수
  private static long numOfCircles;
  private static long numOfRedCircles;

  // 인스턴스 변수
  private double radius;
  private String color;

  // 생성자
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
    numOfCircles++;
    if (color.equalsIgnoreCase("red")) {
      numOfRedCircles++;
    }
  }

  public static long getNumOfCircles() {
    return numOfCircles;
  }

  public static void setNumOfCircles(long numOfCircles) {
    Circle.numOfCircles = numOfCircles;
  }

  public static long getNumOfRedCircles() {
    return numOfRedCircles;
  }

  public static void setNumOfRedCircles(long numOfRedCircles) {
    Circle.numOfRedCircles = numOfRedCircles;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
