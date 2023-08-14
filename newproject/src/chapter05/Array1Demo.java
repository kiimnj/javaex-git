package chapter05;

import java.util.Scanner;

public class Array1Demo {
  public static void main(String[] args) {
    // 표준입력으로 5과목 점수 입력 받고 배열에 저장
    // 배열의 점수 총합, 평균 구하기
    Scanner in = new Scanner(System.in);
    int[] scores = new int[5];
    int sum = 0;
    float avg = 0.0f;

    System.out.println("5과목의 점수 입력 : ");
    for (int i = 0; i < scores.length; i++) {
      scores[i]  = in.nextInt();
//      sum += scores[i];
    }

    for (int score : scores) {
      sum += score;
      System.out.println(score);
    }

    avg = sum / (float)scores.length;

    System.out.printf("sum = %d, avg = %.1f", sum, avg);
  }
}
