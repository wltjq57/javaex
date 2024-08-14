package basic;

public class ForDemo {
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++ ) {                                       // for 반복문 ( 초기식 ; 조건식 ; 증감식
      String s = "hello world";
      System.out.printf("%d번째 %s\n", i, s);
//      System.out.print(i);
//      System.out.println("hello world");

    }
  }
}
