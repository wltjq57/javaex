package interface_package;

public class Notebook extends Computer implements Portable{
  @Override
  public void inMyBag() {
    System.out.println("노트북은 가방에 있다.");
  }

  @Override
  public void turnOn() {
    System.out.println("노트북을 켠다");
  }

  @Override
  public void turnOff() {
    System.out.println("노트북을 끈다");
  }
}
