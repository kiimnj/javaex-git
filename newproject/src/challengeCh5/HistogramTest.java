package challengeCh5;

import java.util.Scanner;

public class HistogramTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = 0;
    int mok = 0;
    int[] numbers = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.printf("%d 번째 숫자(0~99사이의 정수)를 입력하세요.", i + 1);
      num = in.nextInt();
      if(num >= 0 && num < 100) {
        mok = num / 10;
        numbers[mok]++;
      }
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%d 에서 %d : ", i*10, i*10 + 9);
      for(int j = 0; j < numbers[i]; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }


    //입력 변수를 범위에 해당하는 hist 변수값을 ++하려는 시도
//    int[] num = int[10];
//    int[] hist = int[10];
//    Scanner in = new Scanner(System.in);
//    for (int i = 0; i < num.length; i++) {
//      num[i] = in.nextInt();
//      if (num ~~) {
//        hist[i]++;
//      }
//    }
//
//    for (int i = 0; i < hist.length; i++) {
//      System.out.printf("%d~%d : ", i + 10*i, i+9 + 10*i);
//      System.out.printf("*" * hist[i]);
//    }
  }
}
