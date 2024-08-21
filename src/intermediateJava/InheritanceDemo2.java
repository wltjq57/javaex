package intermediateJava;

public class InheritanceDemo2 {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
    animal.sleep();

    Tiger tiger = new Tiger();
    tiger.eat();
    tiger.run();

    Eagle eagle = new Eagle();
    eagle.eat();
    eagle.fly();

    Goldfish goldfish = new Goldfish();
    goldfish.eat();
    goldfish.swim();

  }
}

class Animal {
  String eye;
  String mouth;

  void eat() {
    System.out.println("먹다.");
  }

  void sleep() {
    System.out.println("자다.");
  }
}


class Tiger extends Animal{ // Animal 클래스를 상속받았다 : extends
  String legs;

  void run(){
    System.out.println("달리다.");
  }
}

class Eagle extends Animal{
  String wings;

  void fly(){
    System.out.println("날다.");
  }
}

class Goldfish extends Animal{
  String fins;

  void swim(){
    System.out.println("헤엄치다.");
  }
}
