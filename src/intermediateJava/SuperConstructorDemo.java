package intermediateJava;

public class SuperConstructorDemo {
  public static void main(String[] args) {
    ColoredBox cb = new ColoredBox(10); // 생성자
    System.out.println(cb.size);

  }
}

class Box { // 부모생성자
  int size;
  public Box(int size) {
    this.size = size;
  }
}

class ColoredBox extends Box {
  public ColoredBox(int size) {
    super(size); // 부모 생성자를 호출 자기자신은 this
  }
}