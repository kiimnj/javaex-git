package chapter05;

import java.util.Arrays;

public class Array2Ex {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    for (int num: arr) {
      System.out.println(num);
    }
    System.out.println(arr); // [I@776ec8df의 [ : '배열', I : int

    // [1, 2, 3, 4, 5]로 출력
    System.out.println(Arrays.toString(arr)); // 함수 열어보기 - toString이 오버fㄹ딩 되어있음


    // 문자 배열
    char[] cArr = {'a', 'b', 'c', 'd', 'e'};
    for (char c : cArr) {
      System.out.println(c); // cArr : String이기 때문에 주소가 아닌 값 출력
    }

    System.out.println(cArr);
    System.out.println(Arrays.toString(cArr));
  }
}
