package classExample;

public class Car {
  int speed;
  boolean direction = true;

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setDirection(boolean direction) { // String gear- if, else로 만들 수도
    this.direction = direction;
  }
}
