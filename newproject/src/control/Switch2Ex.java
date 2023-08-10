package control;

public class Switch2Ex {
  public static void main(String[] args) {
    whoIsIt("호랑이");
    whoIsIt("독수리");
    whoIsIt("메미");
  }
  static void whoIsIt(String bio) {
    String kind = "";
    switch (bio) {
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      default:
        kind = "해당없음";
    }
    System.out.printf("%s는 %s입니다.\n", bio, kind);
  }

}
