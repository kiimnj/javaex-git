package method;

public class Method1Ex {
  public static void main(String[] args) {
    System.out.printf("sum(1~10) = %d\n", sum(1, 10L)); // L 안 붙일 경우 자동형변환-웬만해서 붙이기
    System.out.printf("sum(10~100) = %d\n", sum(10, 100L));
    System.out.printf("sum(100~1000) = %d\n", sum(1_000_000_000L, 2_000_000_000L));
  }

  static long sum(long num1, long num2) {
    int sum = 0; // long으로 정의하지 않아서 이상한 값으로 연산
    for (long i = num1; i <= num2; i++) {
      sum += i;
    }
    return sum;
  }
}
