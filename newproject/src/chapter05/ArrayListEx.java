package chapter05;

import java.util.ArrayList;

public class ArrayListEx {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(); // <Integer> 생략 가능
    System.out.println(numbers);
    numbers.add(10);
    System.out.println(numbers); // [10]: 상속된 함수를 보면 toString() 정의 돼있음
    numbers.add(9);
    System.out.println(numbers); // [10, 9]: 더블리 링크드 리스트
    numbers.add(8);
    System.out.println(numbers);
    numbers.add(0, 11); // 인덱스 지정 가능
    System.out.println(numbers);
    System.out.println(numbers.size()); // 4
    numbers.remove(1); // 기본형 데이터 - 오브젝트로 접근 불가
    System.out.println(numbers.get(2));
  }
}
