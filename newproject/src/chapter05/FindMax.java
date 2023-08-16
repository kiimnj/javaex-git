package chapter05;

import java.util.Arrays;

public class FindMax {
  public static void main(String[] args) {
    // 알고리즘 구현
    int[] numbers = {2, 3, 1};
    int max = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i] > max) max = numbers[i];
    }
    System.out.println("max = " + max);

    // API 사용
    System.out.println(Arrays.toString(numbers));
    Arrays.sort(numbers); // 오름차순
    System.out.println(Arrays.toString(numbers));
    System.out.println("max = " + numbers[numbers.length - 1]);
  }
}
