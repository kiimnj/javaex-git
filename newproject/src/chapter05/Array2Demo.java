package chapter05;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2Demo {
  public static void main(String[] args) {
    // 표준입력으로 5과목 점수 입력 받고 배열에 저장
    // 학생의 수 미정, -1 입력시 종료
    // 배열의 점수 총합, 평균 구하기
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();
    int i = 0;

    while (true) { // int inputScore 변수에 입력 먼저 받은 후 if 뒤에서 add해야
      scores.add(i, in.nextInt());
      if (scores.get(i) == -1){ // <= 0
        break;
      }
      i++;
    }

    int sum = 0;
    float avg = 0.0f;

    for (int score : scores) {
      sum += score;
      System.out.println(score);
    }

    if (scores.size() == 0){ // 빈 배열일 때 에러나지 않도록
      avg = 0;
    } else {
      avg = sum / (float)scores.size();
    }

    System.out.printf("sum = %d, avg = %.1f", sum, avg);
  }
}
