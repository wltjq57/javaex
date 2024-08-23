package exercise_ch07;

public class Mission3_2 {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10, 10);
    Triangle t2 = new Triangle(5, 10);


    if (t2.compareTo(t1) > 0) {
      System.out.print(t2);
      System.out.println(" 이 더 큽니다.");
    } else if (t2.compareTo(t1) == -1) {
      System.out.print(t1);
      System.out.println(" 이 더 큽니다.");
    } else if (t2.compareTo(t1) == 0) {
      System.out.println("같습니다.");
    } else {
      System.out.println("비교할 수 없습니다.");
    }
  }
}