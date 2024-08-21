package intermediateJava;

public class SquareInheritDemo {
  public static void main(String[] args) {
    Square square = new Square(3, 4);
    int area = square.getArea();
    System.out.println(area);
  }
}

class nemo {
  private int poly;
  public int getArea(){
    return 0;
  }
}

class Square extends nemo {
  private int poly = 4;
  private int height;
  private int width;

  public Square(int height, int width) { // 생성자, 알트 + 인서트 Constructor
    this.height = height;
    this.width = width;
  }

  @Override // 컨트롤 + O = 오버라이드
  public int getArea() {
    return width * height ;
  }
}
