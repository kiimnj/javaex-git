package challengeCh5;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    System.out.println("URL을 입력하세요 : ");
    Scanner in = new Scanner(System.in);
    String url = in.next();
    boolean com = url.endsWith("com");
    boolean java = url.contains("java");
    boolean bye = url.equals("bye");
    if (com) {
      System.out.println("%s은 'com'으로 끝납니다.");
    }
    else if (java) {
      System.out.println("%s은 'java'를 포함합니다.");
    }
    else if (bye) {
      break;
    }
  }
}
