package classExample;

public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();

    Bird bird = new Bird();
//    bird.헤엄친다();
    bird.움직인다();
    System.out.println("bird = " + bird);

    Tiger tiger = new Tiger();
    tiger.움직인다();
    System.out.println("tiger = " + tiger);
  }
}
