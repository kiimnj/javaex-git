package chapter05;

public class IncrementEx {
  public static void main(String[] args) {
    // edit config - args 추가하면 args 사용 가능
    int[] x = {0, 1, 2};

    increment(x);
  }

  static void increment(int[] n) {
    // 배열을 가리키는 참조변수가 넘어가는 것 (주소값 복사)
    n[0]++;
  }
}
