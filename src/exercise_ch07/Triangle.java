package exercise_ch07;

public class Triangle implements Comparable{

  int width,height ;
    double getArea;




  // 생성자
  public Triangle(int width, int height) {
    this.width = width;
    this.height = height;
  }



  public double getArea() {
    return (width * height) / (double)2;
  }



  @Override
  public int compareTo(Object o) {
    if(o instanceof Triangle) {
      Triangle triangle = (Triangle)o;
      int result;
      if(this.getArea() < triangle.getArea()) result = -1;
      else if(this.getArea() > triangle.getArea()) result = 1;
      else result = 0;
      return result;
    }
    return 0;
  }

  @Override
  public String toString() {
    return "삼각형[" +
        "width=" + width +
        ", height=" + height +
        ", 넓이=" + getArea() +
        ']';
  }
}


