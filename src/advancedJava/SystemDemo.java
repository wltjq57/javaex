package advancedJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class SystemDemo {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    LinkedList dl = new LinkedList();

    long before = System.nanoTime();
    for (int i = 0; i < 100; i++) {
      al.add(i);
    }
    long after = System.nanoTime();
    System.out.println("ArrayList 실행시간 " + (after - before));

    before = System.nanoTime();
    for (int i = 0; i < 100; i++) {
      dl.add(i);
    }
    after = System.nanoTime();
    System.out.println("LinkedList 실행시간 " + (after - before));
  }
}
