package chapter06;

public class Box {
  String name;
  public Box(String name){
    this.name = name;
  }

  class ColoredBox extends Box {
    public ColoredBox(String name) {
      super(name);
    }
//    public ColoredBox(){} // 생성자 말들지 말든가, 부모의 생성자(세트)를 먼저 만들든가 - 컴파일에러
  }
}
