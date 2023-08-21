package chapter07;

public class TV implements Controllable, RemoteControllable{
  // 두 인터페이스에 각각 메서드 두개 구현 - 네개 메소드 구현해야함
  // 컨+O 혹은 빨간줄에서 알트+엔터

  @Override
  public void turnOn() {
    System.out.println("TV를 켠다");
  }

  @Override
  public void turnOff() {
    System.out.println("TV를 끈다");
  }

  @Override
  public void RemoteOn() {
    System.out.println("리모컨으로 TV를 켠다");
  }

  @Override
  public void RemoteOff() {
    System.out.println("리모컨으로 TV를 끈다");
  }

  @Override
  public void repair() {
    System.out.println("TV를 수리한다");
  }
}
