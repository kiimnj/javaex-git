package challangeCH6;

public class OverrideTest {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200, 1000, 5);
    c.show();

    System.out.println();
    Vehicle v = c; //업캐스팅
    v.show();
  }
}

class Vehicle{
  String color;
  int speed;
  public Vehicle(){}
  public Vehicle(String color, int speed){
    this.color = color;
    this.speed = speed;
  }

  void show(){

  }
}

class Car extends Vehicle{
  int displacement;
  int gears;
  public Car(){}
  public Car(String color, int speed, int displacement, int gears){
//    this.color = color;
//    this.speed = speed;
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }
  void show(){
    System.out.printf("color, speed, displacement, gears: ",color, speed, displacement, gears);
  }
}
