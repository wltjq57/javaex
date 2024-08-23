package exercise_ch07;

public abstract class Controller {
  boolean power; // 필드

  void show() { // 메서드
    if(power) {
      System.out.println(getName() + "가 켜졌습니다.");
    } else {
      System.out.println(getName() + "가 꺼졌습니다.");
    }
  }
  abstract String getName(); // 추상메서드
}

class TV extends Controller {
  //생성자
  public TV(boolean power) {
    super.power = power;
  }
  // 메서드
  @Override
  String getName() {
    return "TV";
  }
}

class Radio extends Controller {

  //생성자
  public Radio(boolean power){
    super.power = power;
  }
  //메서드
  @Override
  String getName() {
    return "Radio";
  }
}