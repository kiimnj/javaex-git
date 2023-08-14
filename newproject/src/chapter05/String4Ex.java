package chapter05;

public class String4Ex {
  public static void main(String[] args) {
    String.format("%s %d", "Java", 14); // ctrl+alt+v 변수 자료형 자동완성
    String join = String.join("'", "apple", "banana");
    String.valueOf(1_000_000L); // == ~~ + ""
  }
}
