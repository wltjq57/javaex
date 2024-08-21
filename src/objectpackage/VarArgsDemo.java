package objectpackage;

import java.util.Arrays;

public class VarArgsDemo {
  public static void main(String[] args) {
    printSum(1);
    printSum(1, 10);
    printSum(1, 10, 20);
    printSum(1, 10, 20, 30);
    printSum(1, 10, 20, 30, 40, 50, 60, 70);

  }

//   ...은 가변 개수 인수

//  private static void printSum(int...v) { // 숫자 전체를 합산
//    int sum = 0;
//    for (int i : v) {
//      sum += i;
//    }
//    System.out.println(Arrays.toString(v));
//    System.out.println(sum);
//  }

  private static void printSum(int n, int... numbers) { // 맨앞 숫자를 제외하고 합산
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    System.out.println(Arrays.toString(numbers));
    System.out.println(sum);
  }
}
