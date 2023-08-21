package chapter07;

public class TriangleTest {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10, 10);
    Triangle t2 = new Triangle(5, 10);

    int res = t1.compareTo(t2);
    System.out.println();
    if (res < 0) System.out.println(t2);
    else if (res > 0) System.out.println(t1);
    else System.out.println("두 삼각형의 넓이가 같거나 비교할 수 없습니다.");
  }
}

//class Triangle implements Comparable{
class Triangle implements Comparable<Triangle>{
  int width;
  int height;
//  int area; 이거 이용해서 끝까지 활용하면..?

  public Triangle(int width, int height){
    width = this.width;
    height = this.height;
//    area = 1/2 * width * height;
  }

//  private double findArea(int width, int height){
  private double findArea(){
    return width * height / 2.0;
  }

  @Override
  public int compareTo(Triangle o) {
//  public int compareTo(Object o) {
//    if (o instanceof Triangle){
//      Triangle triangle = (Triangle) o;
      return (int)(this.findArea() - o.findArea());
//    }
//    return 0;
  }

  @Override
  public String toString() {
    return "삼각형 [밑변=" + this.findArea() +"]";
  }
}