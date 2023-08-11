package challangeCh4;

public class DiceTest {
  public static void main(String[] args) {
    Dice d = new Dice();
    for (int i = 1; i <= 6; i++) {
      System.out.printf("%d 주사위의 숫자 : %d\n", i, d.roll());
    }
  }
}
