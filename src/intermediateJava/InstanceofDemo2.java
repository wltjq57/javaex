package intermediateJava;


public class InstanceofDemo2 {
  public static void main(String[] args) {
    Circle c1 = new Circle(5);
    Circle c2 = new Circle(5);
    Circle c3 = new Circle(3);

    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));

  }
}

class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    Circle c = (Circle)obj;
    return this.radius == c.radius; // 아래 2줄을 이 코드로 대체
//    if (this.radius == c.radius) return true;
//    return false;

  }
}
