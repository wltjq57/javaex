package exercise_ch07;

public class Mission5 {
  public static void main(String[] args) {
    Controller[] c = {
        new TV(false),
        new Radio(true)
    };
    for (Controller controller : c) {
      controller.show();
    }
  }
}


