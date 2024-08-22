package exercise_ch06;

public class Mission5 {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    circle.show();

    ColoredCircle coloredCircle = new ColoredCircle(10,"빨간색");
    coloredCircle.show();
  }
}

class Circle {
  int radius; // 필드

  void show() { // 메서드
    System.out.println("반지름이 " + radius + "인 원이다.");
  }

  Circle(int radius){ // 생성자
    this.radius = radius; // 자기자신은 this
  }
}

class ColoredCircle extends Circle { // 자식 extends 부모
  String color; // 필드

  void show() { // 메서드
    System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
  }

  public ColoredCircle(int radius, String color){ // 생성자
    super(radius); // 부모생성자를 호출 super
    this.color=color; // 자기자신은 this
  }
}