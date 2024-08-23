package interface_package;

public class InterfaceDemo6 {
  public static void main(String[] args) {
    Movable m = new Vehicle(); // 업캐스팅
    Vehicle v = new Car();
    Movable c = new Car();

    m.move(3);
    v.move(3);
    c.move(100);

    Car car1 = (Car)c;
    Car car2 = (Car)v;

//    car1.show();
//    car2.show();
  }
}
