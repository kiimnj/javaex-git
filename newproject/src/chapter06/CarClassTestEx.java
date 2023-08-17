package chapter06;

public class CarClassTestEx {
  public static void main(String[] args) {
    Vehicle v = new Car(); //업캐스팅
    System.out.println(v.name); //필드는 오버라이드 안됨
    v.whoAmI(); //메소드는 됨
    v.move();

    Vehicle v1 = new Vehicle();
    v1.whoAmI();

    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = v1;
    vehicles[1] = new Car(); //업캐스팅
    vehicles[2] = new SportsCar();

    for (Vehicle vehicle : vehicles){
      vehicle.whoAmI();
    }
  }
}
