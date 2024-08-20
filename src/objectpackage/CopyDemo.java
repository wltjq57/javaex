package objectpackage;

public class CopyDemo {
  public static void main(String[] args) {
    int ten = 10;
    System.out.println("ten의 값을 수정하는 메소드 호출 전 " + ten);
    copyByValue(ten);
    System.out.println("ten의 값을 수정하는 메소드 호출 후 " + ten);

    Circle c1 = new Circle(1); // 0x100 클래스이름 변수 = new 클래스이름();
    System.out.println("Circle1의 반지름을 수정하는 메소드 호출 전 " + c1.getRadius());
    ByReference(c1);
    System.out.println("Circle1의 반지름을 수정하는 메소드 호출 후 " + c1.getRadius());

  }

  public static void copyByValue(int val) { // call by value:read-only
//    int copyTen = val;
//    System.out.println("ten : " + val);
//    System.out.println("copyTen : " + copyTen);

    val = 20;
    System.out.println("메서드 안에서 ten : " + val);
//    System.out.println("ten : " + val);
//    System.out.println("copyTen : " + copyTen);
  }

  public static void ByReference(Circle c1) { // call by reference:read-write
//    Circle c2 = new Circle(); // 0x200 클래스이름 변수 = new 클래스이름();
//
//    System.out.println("인스턴스 생성 후 ");
//    System.out.println("c1의 반지름 : " + c1.getRadius()); // getRadius = private int radius 값
//    System.out.println("c2의 반지름 : " + c2.getRadius());

//    c2 = c1;
//    System.out.println("주소 복사 후");
//    System.out.println("c1의 반지름 : " + c1.getRadius()); // getRadius = private int radius 값
//    System.out.println("c2의 반지름 : " + c2.getRadius());

    c1.setRadius(10); // c2 = c1
    System.out.println("c1의 반지름 변경 후");
    System.out.println("c1의 반지름 : " + c1.getRadius()); // getRadius = private int radius 값
//    System.out.println("c2의 반지름 : " + c2.getRadius());
  }
}
