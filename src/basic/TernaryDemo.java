package basic;

import java.util.Scanner;

public class TernaryDemo {
  public static void main(String[] args) {
//    int i = 2;
//    int res = i % 2 ;
//    String name = "";
//
////    if (res == 0) {
////       name = "짝수";
////    } else {
////      name = "홀수";
////    }
//    name = (res == 0) ? "짝수" : "홀수" ; // if : else
//    System.out.printf("%d는 %s 입니다.", i, name);
//    x 값을 입력받는다. x가 0보다 크거나 같으면 양수입니다 0 보다 작거나 같으면 음수입니다 출력하도록 조건 연산자를 이용해서 작성


      Scanner in = new Scanner(System.in);
    System.out.println("정수형 숫자를 입력하세요 : ");
      int i = in.nextInt();
      String result = "";
//      ( ) ? T : F
      result = (i >= 0) ? "양수" : "음수";
      System.out.printf("입력한 숫자는 %d이며 %s입니다", i, result);

  }
}
