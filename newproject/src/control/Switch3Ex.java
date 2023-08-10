package control;

import java.util.Scanner;

public class Switch3Ex {
  public static void main(String[] args) {
    // 1
    Scanner in = new Scanner(System.in);
    System.out.println("동물의 이름을 입력하세요.");
    String bio = in.nextLine();
    String kind = ""; // 참조형 개체는 null이 아닌 빈 문자열 넣기

    if (bio.equals("호랑이") || bio.equals("사자")) {
      kind = "포유류";
    } else {
      kind = "해당없음";
    }
    System.out.printf("%s는 %s입니다.\n", bio, kind);

    // 2
    in = new Scanner(System.in);
    System.out.println("동물의 이름을 입력하세요.");
    bio = in.nextLine();
    kind = "";

    switch (bio) {
      case "호랑이":
      case "사자":
        kind = "포유류";
        break; // 마지막 case에
      default:
        kind = "해당없음";
    }
    System.out.printf("%s는 %s입니다.\n", bio, kind);

    // 3 : 자바 14~
    in = new Scanner(System.in);
    System.out.println("동물의 이름을 입력하세요.");
    bio = in.nextLine();
    kind = "";

    switch (bio) {
      case "호랑이", "사자" -> kind = "포유류";

    }
  }
}
