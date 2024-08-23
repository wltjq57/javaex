package interface_package;
/*
 장비를 켜고 끄는 기능을 구현해야하며
 수리와 초기화 기능이 구현되어 있습니다.
 */
public interface Controllable {
  default void repair() {
    show("장비를 수리한다.");
  }

  static void reset() {
    System.out.println("장비를 초기화한다.");
  }

  private void show(String s) {
    System.out.println(s);
  }
  void turnOn(); //abstract 생략
  void turnOff(); //abstract 생략
}
