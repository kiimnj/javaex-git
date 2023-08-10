package method;

public class MethodOverloading {
  public static void main(String[] args) {
    System.out.println(sum(1, 2));
    System.out.println(sum(1, 2, 3));
    System.out.println(sum(10L, 20L, 30L));
    // println조차도 오버로딩되어 정의
  }

  static int sum(int i, int j) {
    return i + j;
  }

  static int sum(int i, int j, int k) {
    return i + j + k;
  }

  static long sum(long i, long j, long k) {
    return i + j + k;
  }
}
