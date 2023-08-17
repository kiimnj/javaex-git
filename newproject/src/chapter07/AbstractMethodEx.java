package chapter07;

public class AbstractMethodEx {
  public static void main(String[] args) {

  }
}

abstract class Database{ //선언부만 있고 구현부(몸통, body)가 없는 메서드
  double PI = 3.14;
  abstract void use(); //하나이상의 추상메서드 포함 - 자식클래스에 구현해야하는 메서드
  abstract double getPI();
}

class Mysql extends Database{
  @Override //컨트롤+O
  void use() {
    System.out.println("Mysql을 사용합니다.");
  }
  @Override
  double getPI(){ return 0;}
}

class Oracle extends Database{
  @Override
  void use() {
    System.out.println("Oracle을 사용합니다.");
  }
  @Override
  double getPI(){ return 0;}
}