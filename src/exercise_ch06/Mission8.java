package exercise_ch06;


public class Mission8 {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();
  }
}

class Parent {
  String name = "영조"; // 필드

  void print() { // 메서드
    System.out.println("나는 " + name + "이다.");
  }
}

class Child extends Parent {
  String name = "사도세자";

  @Override
  void print() {
    System.out.println("나는 " + name + "이다.");
  }
}



