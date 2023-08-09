package sample;

import java.util.Scanner;

public class InputOutput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    int i = scanner.nextInt();
//    System.out.println(i);

    String s = scanner.nextLine();
    int i2 = Integer.parseInt(s);
    System.out.println(i2);

    int a = 1_000_000;
    int b = 2_000_000;
//    long c = a * (long)b ; // 혹은 int c = a * b;
    int c = a * b;
    System.out.println(c);

    double res = 5/0.0; // Infinity
    double r = 5 % 0.0; // NaN
    boolean b1 = Double.isInfinite(res);
    boolean b2 = Double.isNaN(r);
    System.out.println("res = " + res); // : 익셉션 오류: 런타임 에러- 골치 아픔, 컴파일 에러는 괜찮음
    System.out.println("r = " + r);
    System.out.println("b1 = " + b1); // true
    System.out.println("b2 = " + b2); // true

    // 커밋 수정 실험
  }
}
