package classExample;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle();// new: heap 영역에 올라감
    circle.setRadius(10.0); // 은닉 시키지 않을 경우 circle.radius로 접근 제어 가능
    circle.setRadius(-10.0); // 바뀌지 않아야 함
    System.out.printf("circle의 넓이 = %.2f", circle.findArea());
  }
}

