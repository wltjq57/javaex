package objectpackage;

class Circle {
  // 필드 - 캡슐화 전
  static final double PI = Math.PI;
  private int radius = 1; // 반지름 초기 값에 영향

  public Circle(int radius) {
    if(radius <= 0){
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    } else {
      this.radius = radius;
    }

  }
  // 생성자 (기본생성자,~~~)

  // 메서드

  /**
   * 인스턴스를 생성해야 호출할 수 있는 메서드
   * 매개변수x 리턴값x
   */
  public void printRadius() {
    System.out.println("원의 반지름 : " + radius);
  }

  /**
   * 원의넓이를 구하여 리턴하는 메서드
   * 매개변수 X 리턴값 O (double)
   */
  public double getArea() {
    double area = PI * radius * radius;
    return area;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) { // setter를 자동으로 만든 후에 비즈니스 로직을 더 하는것 = 캡슐화
    if(radius <= 0) {
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    } else {
      this.radius = radius;
    }
  }
}
