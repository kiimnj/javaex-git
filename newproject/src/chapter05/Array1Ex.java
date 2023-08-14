package chapter05;

public class Array1Ex {
  public static void main(String[] args) {
    int sum = 0, avg = 0;
    int sc1 = 90;
    int sc2 = 80;
    int sc3 = 100;

    sum = sc1 + sc2 + sc3;
    avg = sum / 3;


    // 배열 사용
    sum = 0;
    avg = 0;
    int[] scores = {90, 90, 100};
//    int[] scores = new int[3]; // 객체이므로 0으로 초기화됨
//    scores[0] = 90; // heap
//    scores[1] = 80;
//    scores[2] = 100;
    for (int i = 0; i < scores.length; i++) { // fori
      sum += scores[i];
    }
    avg = sum / scores.length;
    System.out.printf("sum = %d, avg = %d\n", sum, avg);


    // 배열 크기 늘리기
    int[] scoresBig = new int[5];
    for (int i = 0; i < scores.length; i++) {
      scoresBig[i] = scores[i];
    }
    scores = scoresBig; // 주소 할당 - 배열 크기 늘리기, 보통 두배로
    scores[3] = 100;
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]); // scores[4] = 0
    }

    // foreach
    for (int score : scores) {
      System.out.println(score);
    }
  }
}
