package chapter07;

public class EagleTest extends ABird {
  public static void main(String[] args) {
//    Eagle e = new Eagle();
    ABird b = new ABird(){
      @Override
      void fly() {
        System.out.println("독수리가 날아간다");
      }
    };
//    e.fly();
    b.fly();
  }
}

//class Eagle extends ABird{
//  @Override
//  void fly() {
//    System.out.println("독수리가 날아간다");
//  }
//}