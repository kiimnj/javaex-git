package challangeCh4;

public class Triangle {
  private double bottom;
  private double height;

  // 생성자
  public Triangle(double bottom, double height) {
    this.bottom = bottom;
    this.height = height;
  }

  // getter
  public double getBottom() {
    return bottom;
  }

  public double getHeight() {
    return height;
  }

  // setter
  public void setBottom(double bottom) {
    if (bottom <= 0) {
      System.out.println("밑변은 0보다 커야합니다.");
      return; // else문 대신
    }
    this.bottom = bottom;
  }

  public void setHeight(double height) {
    if (height <= 0) {
      System.out.println("높이는 0보다 커야합니다.");
      return;
    }
    this.height = height;
  }

  // 너비
  public double findArea() {
    return bottom * height / 2;
  }
  public boolean isSameArea(Triangle t2) {
//    if (this.findArea() == t2.findArea()) {
//      return true;
//    } else {
//      return false;
//    }
    return this.findArea() == t2.findArea();
  }
}
