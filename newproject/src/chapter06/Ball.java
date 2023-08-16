package chapter06;

public class Ball extends Circle {
  public double findVolume() {
    return 4/3 * Math.PI * radius * radius * radius;
  }

  @Override // 덮어쓰기 - 자식 클래스에 맞게 수정하기
  public double findArea() {
    return super.findArea();
  }

  @Override
  protected void findRadius() {
    super.findRadius();
  }
}
