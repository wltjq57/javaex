package basic;

public class OverflowDemo {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;

    long result = (long)a * b; // a와 b앞에 long을 놓으면 됨 (long)(a*b)는 x

    System.out.println(result);
  }
}
