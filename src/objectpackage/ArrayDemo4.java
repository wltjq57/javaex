package objectpackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo4 {
  public static void main(String[] args) {
    // long 타입의 가격을 5개 입력받아서 sum 과 avg 를 출력하려고 한다.
    // 가격은 사용자로부터 입력받아서 prices 배열에 저장을 한다
    // 배열에 들어있는 가격정보를 이용해 sum 과 avg를 구하라
    // 재사용성을 고려

    Scanner in = new Scanner(System.in);
    long prices[] = new long[5];


    for (int i = 0; i < prices.length; i++) {
      System.out.println("가격을 입력하세요 : ");
      prices[i] = in.nextLong();

    }
    long sum = 0L;
      for (int i = 0; i < prices.length; i++) {
        sum += prices[i];

      }
    double avg = sum / (double) prices.length;
    System.out.println(Arrays.toString(prices));
    System.out.println("합계 = " + sum + " 입니다.");
    System.out.println("평균 = " + avg + " 입니다.");

    sum = 0L;
        for (long price : prices) {
          sum += price;
        }

        avg = sum / (double) prices.length;
    System.out.println(Arrays.toString(prices));
    System.out.println("합계 = " + sum + " 입니다.");
    System.out.println("평균 = " + avg + " 입니다.");
  }
}
