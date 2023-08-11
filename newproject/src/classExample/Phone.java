package classExample;

public class Phone {
  private static long numOfPhones; //setter X, getter O
  String model;
  int value;

//  public Phone() { } // 기본 생성자

  public Phone(String model, int value) { // 생성자 오버로딩
    this.model = model;
    this.value = value;
    numOfPhones++;
  }

  public static long getNumOfPhones() {
    return numOfPhones;
  }

  void print() {
    System.out.println(value + "원 짜리 " + model + "의 스마트폰임");
  }

}
