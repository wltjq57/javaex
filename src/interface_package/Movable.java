package interface_package;

import java.sql.SQLOutput;

/**
 *  모든 탈것은 움직인다.
 *  자동차는 ( ? ) 거리만큼 이동한다
 */

public interface Movable {
  void move(int distance);
}

class Vehicle implements Movable {
  @Override
  public void move(int distance) {
    System.out.println("모든 탈 것은" + distance + " 움직인다.");
  }
}

class Car extends Vehicle {
  @Override
  public void move(int distance) {
    System.out.println("자동차는 " + distance + " 거리만큼 움직인다");
  }
}

//int gears;
//void show() {
//  System.out.println("기어를 가진 자동차입니다");
//}

