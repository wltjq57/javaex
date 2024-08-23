package exercise_ch07;

public class Mission4 {
  static void speak(Talkable talkable){
    talkable.talk();
  }

  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }
}
