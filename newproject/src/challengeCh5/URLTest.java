package challengeCh5;

import java.util.Scanner;

public class URLTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
//    String url = in.next();
    String url = "";

  while(true){
    System.out.println("URL을 입력하세요 : (종료하려면 bye 입력)");
    url = in.nextLine();

    if(url.equalsIgnoreCase("bye")) break;
    if (url.toLowerCase().endsWith("com")) {
      System.out.printf("%s은 \'com\'으로 끝납니다.\n",url);
    }
    if (url.toLowerCase().contains("java")) {
      System.out.printf("%s은 \'java\'를 포함합니다.\n",url);
    }
  }

      // 굳이 변수 분리할 필요 없음
//    boolean com = url.endsWith("com");
//    boolean java = url.contains("java");
//    boolean bye = url.equals("bye");
//    if (com) {
//      System.out.printf("%s은 'com'으로 끝납니다.\n",url);
//    } else if (java) {
//      System.out.printf("%s은 'java'를 포함합니다.\n",url);
//    } else if (bye) {
//      break;
//    }

  }
}
