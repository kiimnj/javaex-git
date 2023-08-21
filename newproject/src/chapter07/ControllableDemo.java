package chapter07;

public class ControllableDemo {
  public static void main(String[] args) {
//    TV tv1 = new TV();
//    tv1.turnOn();
//    tv1.turnOff();
//    tv1.repair();
//
//    TV tv2 = new TV();
//    tv2.turnOn();
//    tv2.turnOff();
//    tv2.repair();
//
//    Computer computer = new Computer();
//    computer.turnOn();
//    computer.turnOff();
//    computer.repair();
//    Controllable.reset(); // Controllable 인터페이스의 static 메서드 사용
//
//    Notebook notebook = new Notebook();
//    notebook.turnOn();
//    notebook.turnOff();
//    notebook.inMyBag();

  Controllable[] controllables = {
      new TV(),
      new Computer(),
      new Notebook()
  };

  for (Controllable controllable: controllables) {
    controllable.turnOn();
    controllable.turnOff();
    controllable.repair();
    Controllable.reset(); //대문자 주의
  }
  }
}
