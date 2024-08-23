package interface_package;

public class InterfaceDemo {
  public static void main(String[] args) {
    Class1 c1 = new Class1();
    c1.sayHello();
    c1.sayGoodBye();
    MyInterface.method();
    System.out.println(c1.MAX);
  }
}

class Class1 implements MyInterface { // implements = 구현
  @Override
  public void sayHello() {
    System.out.println("Hello");
  }
}
