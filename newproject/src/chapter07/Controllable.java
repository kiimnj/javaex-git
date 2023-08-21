package chapter07;

public interface Controllable {
  /**
   * @param : X
   * @return : void
   * @throws : X
   * @implNote : 전자제품을 제어하기 위한 메서드를 가진 ~~
   */
  default void repair() {
//    System.out.println("수리");
    show("수리");
  }
  static void reset() {
    // show()하려면 show()도 static이어야
    System.out.println("초기화");
  }
  private void show(String s){
    System.out.println(s);
  }
  void turnOn();
  void turnOff();
}
