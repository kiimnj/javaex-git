package chapter07;

import java.util.Arrays;
import java.util.Collections;

public class PersonCompareTest {
  public static void main(String[] args) {
    Person[] persons = {
        new Person("홍길동", 32,170,75),
        new Person("박지성", 40,175,68),
        new Person("손흥민", 20,180,70)
    };

    //나이(내림차순) 키 몸무게 별 소트, 비교 - 이름 출력
    //위 내림차순 방법 1.compareTo 리턴값 2.sort할 때 순서 뒤집기(내림차순)
    System.out.println("정렬전");
    for (Person person:persons) {
      System.out.println(person);
    }

    Arrays.sort(persons); // 오름차순
    Arrays.sort(persons, Collections.reverseOrder()); // 내림차순

    System.out.println("정렬후");
    for (Person person:persons) {
      System.out.println(person);
    }

  }
}

class Person implements Comparable<Person>{
  String name;
  int age, height, weight;
  public Person(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

    @Override
    public int compareTo(Person person) {
      return this.age - person.age; // 오름차순
      //person.age - this.age;  내림차순
  }

  @Override
  public String toString() {
    return "Person[이름="+name+", 나이="+age+"]";
  }
}