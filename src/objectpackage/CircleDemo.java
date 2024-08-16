package objectpackage;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle(); // // 클래스이름 변수 = new 클래스이름();
    int radius = c1.getRadius();
    double area;
    System.out.println("원의 반지름 초기 값 : " + radius);
    c1.setRadius(0); // 변경 값, 반지름, 넓이에 영향
    System.out.println("원의 반지름 변경 값 : " + c1.getRadius());
    c1.printRadius();
    area = c1.getArea();
    System.out.println("원의 넓이 : " + area);
    System.out.println("반올림한 원의 넓이 : " + Math.round(area));
  }
}
