package chapter05;

import classExample.Circle;

public class ArrayClass1Ex {
  public static void main(String[] args) {
    // findArea가 있는 circle을 원소로 가지는 배열, 크기는 5
    // circle의 radius 1,2,3,4,5
    // 원의 넓이를 출력
    Circle[] circles = new Circle[5];
    for (int i = 0; i < circles.length; i++) {
      circles[i] = new Circle((double) i+1);
//      circles[i].setRadius(i+1);
      System.out.printf("circle의 반지름 = %.2f, circle의 넓이 = %.2f\n", circles[i].getRadius(), circles[i].findArea());
    }

//    int i = 0;
//    for (Circle circle : circles) {
//      System.out.printf("circle의 반지름 = %d, circle의 넓이 = %.2f\n", i++, circles[i].findArea());
//    }

    // 원의 반지름을 1씩 증가시키는 change 함수 생성
    // 함수가 실행된  이후에 원의 반지름이 1씩 증가할 수 있도록 참조변수를 매개변수로 하는 메서드 만들기
    System.out.println("change함수 실행 후");
    for (int i = 0; i < circles.length; i++) {
      circles[i].change();
      System.out.printf("circle의 반지름 = %.2f, circle의 넓이 = %.2f\n", circles[i].getRadius(), circles[i].findArea());
    }
  }
}
