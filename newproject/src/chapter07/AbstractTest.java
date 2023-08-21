package chapter07;

public class AbstractTest {
  public static void main(String[] args) {
    Concrete c = new Concrete(100,50);
    c.show();
  }
}

abstract class Abstract{
  int i;
  public Abstract(int i ){
    this.i = i;
  }
  abstract void show(); //{} 아니고 ;
}

class Concrete extends Abstract{
  int j ;
  public Concrete(int i , int j){
    super(i);
    this.j = j;
  }

  @Override
  void show() {
    System.out.printf("i = %d, j = %d", i , j);
  }
}