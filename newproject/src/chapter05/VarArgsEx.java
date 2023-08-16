package chapter05;

public class VarArgsEx {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5,6,7};
    printSum(1,2,3);
    printSum(numbers);
  }
//  static void printSum(int n1, int n2, int n3) n개의 오버로딩마다 코딩해줘야
  static void printSum(int...number) { // 가변 개수 변수 정의
    int sum = 0;
    for (int num : number) {
      sum += num;
    }
    System.out.println("sum = " + sum);
  }
}

