package challengeCh5;

import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    int[] num = int[10];
    int[] hist = int[10];
    Scanner in = new Scanner(System.in);
    for (int i = 0; i < num.length; i++) {
      num[i] = in.nextInt();
      if (num ~~) {
        hist[i]++;
      }
    }

    for (int i = 0; i < hist.length; i++) {
      System.out.printf("%d~%d : ", i + 10*i, i+9 + 10*i);
      System.out.printf("*" * hist[i]);
    }
  }
}
