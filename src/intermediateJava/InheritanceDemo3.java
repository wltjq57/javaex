package intermediateJava;

public class InheritanceDemo3 {
  public static void main(String[] args) {
    Child child = new Child();
    child.method3();
    child.method1();
    child.method2();

  }
}

class Parent {
  void method1() {
    System.out.println("method1 == parent");
  }

  void method2() {
    System.out.println("method2 == parent");
  }
}

class Child extends Parent { // 자식 extends 부모
  @Override
  void method2() {
    System.out.println("method2 == modified by child"); // method2를 덮어씀
  }

  void method3() {
    System.out.println("method3 == added by child");
  }
}
