package challengeCh5;

public class Test2 {
  public static void main(String[] args) {
    System.out.println(sum(1,2,3,4));
    int[] arr = {2,3};
    System.out.println(sum(1,arr));
    System.out.println(sum(1,2,3,4,5));

  }

  static int sum(int number, int...numbers) { // 가변 매개 변수는 마지막 인자로
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }

    return number + sum;
  }
}
