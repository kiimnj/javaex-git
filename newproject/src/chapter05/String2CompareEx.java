package chapter05;

import classExample.Car;

public class String2CompareEx {
  public static void main(String[] args) {
    String s1 = "HI, JAVA";
    String s2 = "Hi, java";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));

    Car c1 = new Car(); // class Ex
    Car c2 = new Car();
    System.out.println(c1 == c2); // 주소
    System.out.println(c1.equals(c2)); // 값
  }
}
