package interface_package;

public class AnonymousDemo2 {
  public static void main(String[] args) {
    Parent p = new Parent() {
      @Override
      public void callOnce() {
        System.out.println("딱 한 번만 호출됩니다.");
        newMethod();
      }
      public void newMethod() {
        System.out.println("익명객체의 새로운 메서드");
      }
    };
    p.callOnce();
  }
}

interface Parent {
  void callOnce();
}

