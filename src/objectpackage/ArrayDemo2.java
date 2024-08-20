package objectpackage;

public class ArrayDemo2 {
  public static void main(String[] args) {

    int[] scores = new int[] {10, 20, 30, 40, 50};
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i] + ",");
    }
    System.out.println("");


    scores = new int[10];
    for (int i = 0; i < scores.length; i++) {
      scores[i] = i + 1;
      System.out.print(scores[i] + ",");
    }

  }
}
