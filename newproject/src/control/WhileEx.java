package control;

import java.util.Scanner;

public class WhileEx {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String bio = "", kind = "";

    while(true){
      System.out.println("동물의 이름을 입력하세요. (종료 입력 시 종료)\n");
      if (bio.equals("종료")) break;
      bio = in.next();
      switch (bio) {
        case "호랑이", "사자" -> kind = "포유류";
        default -> kind = "해당없음";
      }
      System.out.printf("%s는 %s입니다.\n", bio, kind);
    }
  }
}
