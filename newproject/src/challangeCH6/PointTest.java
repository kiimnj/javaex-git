package challangeCH6;

public class PointTest {
  public static void main(String[] args) {

  }
}

class Point{
  private int x, y; //getX()아니고 super.getX()
  Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
//  public void setX(int x){
//    this.x = x;
//  }
//  public void setY(int y){
//    this.y = y;
//  }

  @Override
  public String toString(){
    return "좌표 ("+ x + "," + y + ")";
  }
}

class MovablePoint extends Point{
  private int xSpeed, ySpeed;
  MovablePoint(int x, int y, int xSpeed, int ySpeed){
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  public int getxSpeed(){
    return xSpeed;
  }
  public int getySpeed(){
    return ySpeed;
  }
//  public void setX(int xSpeed){
//    this.xSpeed = xSpeed;
//  }
//  public void setY(int ySpeed){
//    this.ySpeed = ySpeed;
//  }
  @Override
  public String toString() {
    return "좌표 ("+ super.getX() + "," + super.getY() + ") : " +
        "이동속도 (" + xSpeed + " , " + ySpeed + " )";
  }
}