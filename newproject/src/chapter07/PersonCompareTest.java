package chapter07;

public class PersonCompareTest {
  Person[] persons = {
      new Person("홍길동", 32,170,75),
      new Person("박지성", 40,175,68),
      new Person("손흥민", 20,180,70)
  };
  //나이(내림차순) 키 몸무게 별 소트, 비교 - 이름 출력
  //위 내림차순 방법 1compareTo 리턴값 2sort할 때 순서 뒤집기

}

class Person{
  String name;
  int age, height, weight;
  public Person(String name, int age, int height, int weight){
    name = this.name;
    age = this.age;
    height = this.height;
    weight = this.weight;
  }
}