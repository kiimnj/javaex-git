package sample;

/**
 * Hello sample class
 * main method
 * hello 출력하는 프로그램
 */

public class Hello {
  public static void main(String[] args) {
//    String hello = "안녕!";
//    System.out.println("hello, world!");
//    System.out.println(hello);
//    String hello = "안녕!";
//    System.out.println("hello, world!");
//    System.out.println(hello);

//    final double PI = 3.14159;
//    var num=100;
//    var name="hello";
//    // int i = 2_140_000_000;
//    long i = 3_140_000_000L;
//    double d = 3.14f; // 3.14d도 가능
//    byte b = 127; // 128부터 불가, (byte)붙이면 강제 형변환,
//    // ex1 300=>44(4바이트 중 맨 뒤 바이트 값)
//    // ex2 (float)3.14
//    // b = num;도 불가. num이 언제 범위 벗어날 지  모름


    char three = 3 + '0'; // int
    int i ='3' - '0'; // 숫자
    String str3 = 3 + ""; // 문자열
    int i3 = Integer.parseInt(str3); // int
    int res = i3 + 10; // int
    char c = "3".charAt(1);

    double result = 7 / (double)4;
    System.out.println("result = " + result);
    System.out.printf("i + %d and i3 %s\n", i, i3);


  }
}

