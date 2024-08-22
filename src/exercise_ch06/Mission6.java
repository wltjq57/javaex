package exercise_ch06;

public class Mission6 {
  public static void main(String[] args) {
    Point p = new Point(3,4);
    System.out.println(p);

    MovablePoint m = new MovablePoint(3,4,100,200);
    System.out.println(m);
  }
}

class Point { // 필드
  private int x,y;

  public int getX() { // 메서드 Getter Setter
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  Point(int x,int y){ // 생성자
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return
        "Point{" + "x=" + x + ", y=" + y + '}';
  }
}

class MovablePoint extends Point{ // 필드
  private int xSpeed,ySpeed;

  public int getxSpeed() { // 메서드 getter setter
    return xSpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }

  public MovablePoint(int x, int y, int xSpeed, int ySpeed){ // 생성자
    super(x,y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  @Override
  public String toString() {
    return
        "Point{x=" + super.getX() + ", y=" + super.getY() + "} " +
        "MovablePoint{" + "xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
  }
}
