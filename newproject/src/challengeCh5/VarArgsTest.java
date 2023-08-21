package challengeCh5;

public class VarArgsTest {
  public static void main(String[] args) {
    int[] arr = {2,3};
    System.out.println(sum(1,2,3,4));
    System.out.println(sum(4,arr));
    System.out.println(sum(5,2,3,4,5));
  }

  static int sum(int number, int...numbers) { // 가변 매개 변수는 마지막 인자로
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}
