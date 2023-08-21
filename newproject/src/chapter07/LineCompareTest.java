package chapter07;

public class LineCompareTest {
  public static void main(String[] args) {
    Line l1 = new Line(10);
    Line l2 = new Line(20);

    int res = l1.compareTo(l2);
    System.out.println();
    if (res < 0) System.out.println(l2);
    else if (res > 0) System.out.println(l1);
    else System.out.println("두 선의 길이가 같습니다.");
  }
}

//class Line implements Comparable<Line>{
class Line implements Comparable{
  int length;
  public Line(int length){
    this.length = length;
  }

//    @Override
//  public int compareTo(Line line) {
//    return this.length - line.length;
//  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Line){
      Line line = (Line)o;
      return this.length - line.length;
    }
    return 0;
  }

  @Override //안해주면 배열값이 아닌 주소값 출력
  public String toString() {
    return "Line [length=" + length +"]";
  }
}