package classExample2;

public class Singleton {
  private static Singleton singleton = new Singleton();
  private Singleton() { // 생성 제한
  }


  static Singleton getInstance(){ // 관례상 getSingleton X
    return singleton;
  }
}
