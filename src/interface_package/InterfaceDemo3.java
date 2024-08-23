package interface_package;

public class InterfaceDemo3 {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.turnOff();
    Controllable.reset();
    tv.repair();

    System.out.println("-------------------------");
    Computer computer = new Computer();
    computer.turnOn();
    computer.turnOff();
    Controllable.reset();
    computer.repair();

    System.out.println("-------------------------");
    Notebook n = new Notebook();
    n.turnOn();
    n.turnOff();
    n.inMyBag();
  }

}
