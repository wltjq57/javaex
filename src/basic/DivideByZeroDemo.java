package basic;

import java.util.Scanner;

public class DivideByZeroDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);

//    in2 = in;
    System.out.println("Scanner 각각 생성 후 비교 " + (in2 == in));
    in2 = in;
    System.out.println("Scanner 주소 값 복사 후 비교 " + (in2 == in));
//    double result = 5 / 2.0;
//    double result = 5 % 0.0;
//    System.out.println("5 나누기 2.0은 나머지가 " + result + "입니다.");

//     System.out.println("정수를 입력하세요 : ");
//    int i = in.nextInt();
//    if (i == 0) {
//      System.out.println("0으로 나눌수 없습니다.");
//    }
//    if (i > 0 ) {
//      int result = 5/i;
//      System.out.printf("5/%d 는 %d입니다. ",i, result);
//    }
  }
}
