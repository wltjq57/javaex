package intermediateJava;

public class FigureInheritDemo {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(3, 3);
    double area = triangle.getArea();
    System.out.println(area);
  }
}

class Figure {
  public int poly = 3;
  public double getArea(){
    return 0.0;
  }
}

class Triangle extends Figure {
  private int poly = 3;
  private int height;
  private int width;

  public Triangle(int height, int width) { // 생성자
    this.height = height;
    this.width = width;
  }

  @Override // 컨트롤 + O = 오버라이드
  public double getArea() {
    return (width * height) / (double)2;
  }
}
