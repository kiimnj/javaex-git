package chapter07;

public class AnonymousDemo {
  public static void main(String[] args) {
    //일회옹(익명)클래스: 원래 인터페이스는 new선언 불가, 내부에 클래스까지 정의하면 가능
    Parent p = new Parent() {
      // 인터페이스 구현 시
//      @Override
//      public void parent() {
//        System.out.println("익명클래스에서 구현한 메서드");
//      }
    };
    p.parent();
  }
}

// 위와 동일
//class OnlyOnce implements Parent{
//
//  @Override
//  public void parent() {
//    System.out.println("parent");
//  }
//}

// 인터페이스로 구현
//interface Parent{
//  void parent();
//}

// 클래스로 구현
class Parent{
  void parent(){
    System.out.println("parent");
  }
}