package chapter05;

public class ForEachEx {
  public static void main(String[] args) {
    int[] one2five = {0, 1, 2, 3, 4};
    int sum = 0;

    for (int i = 0; i < one2five.length; i++) {
      one2five[i]++;
    }
    for (int i : one2five) { // 루프 돌 때마다 매번 i 재정의
      sum += i;
    }
    System.out.println("sum = " + sum);
  }
}
