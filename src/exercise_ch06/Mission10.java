package exercise_ch06;


public class Mission10 {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200, 1000, 5);
    c.show();

    Vehicle v1 = new Vehicle("빨강", 200);
    v1.show();

    System.out.println("ㅋㅋ");
    Vehicle v = c;
    v.show();
  }
}

class Vehicle {
  int speed; // 필드
  String color;

  void show() { // 메서드
    System.out.println("색상은 " + color + " 속도는 " + speed + " 이다.");
  }

  public Vehicle(String color,int speed) { // 생성자
   this.color = color;
   this.speed = speed;
  }
}

class Car extends Vehicle{
  int displacement, gears; // 필드

  @Override
  void show() { // 메서드
    System.out.println("색상은 " + color + " 이며 속도는 " + speed + " 이고" + " 배기량은 " + displacement + " 기어단수는 " + gears + " 이다.");
  }

    public Car(String color, int speed, int displacement, int gears) { // 생성자
      super(color, speed);
      this.displacement = displacement;
      this.gears = gears;
  }
}


