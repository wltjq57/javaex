package interface_package;

public interface MyInterface {
  int MAX = 10; // 상수 , public static final 생략가능

  void sayHello(); // 추상메서드 , public abstract 생략

  default void sayGoodBye() {
    System.out.println("상수값은 " + getMax());
    System.out.println("GoodBye");
  }
  static void method() {
    System.out.println("static method 입니다.");
  }
  private int getMax() {
    return MAX;
  }
}
