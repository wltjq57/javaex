package advancedJava;

public class WrapperDemo {
  public static void main(String[] args) {
    Integer ic = 10; // 자동 박싱

    System.out.println(ic.getClass().getSimpleName());

    int i = ic.intValue(); // 자동 언박싱
    System.out.println(i);

    long lc = 10000000000L; // 자동박싱
    long l = lc; // 자동 언박싱

    double dc = 20.0; // 자동 박싱
    double d = dc; // 자동 언박싱
  }
}
