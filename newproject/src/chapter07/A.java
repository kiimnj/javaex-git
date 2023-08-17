package chapter07;

public interface A {
  void method1();
  void method2();
  default void method3(){}; //클래스마다 추가 안해줘도 됨
}

class C1 implements A{
  @Override
  public void method1() {

  }

  @Override
  public void method2() {

  }
}

class C2 implements A{
  @Override
  public void method1() {

  }

  @Override
  public void method2() {

  }
}

class C3 implements A{
  @Override
  public void method1() {

  }

  @Override
  public void method2() {

  }
}