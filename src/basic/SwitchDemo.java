package basic;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    // 점수를 입력받아서 해당 점수의 Grade를 매기는 프로그램
    // 10 = A 9 = B 8 = C 0~7 = D

    Scanner in = new Scanner(System.in);
//    System.out.println("점수를 입력해주세요 ( 1~10 )");

    int Score = in.nextInt();
    String Grade = "";

    switch (Score) {
      case 10 :
        Grade = "A";
        System.out.println(Grade);
        break;
      case 9 :
        Grade = "B";
        System.out.println(Grade);
        break;
      case 8 :
        Grade = "C";
        System.out.println(Grade);
        break;
      default :
        Grade = "D";
        System.out.println(Grade);
    }

//    if (Score == 10) {
//      Grade = "A";
//    } else if (Score == 9) {
//      Grade = "B";
//    } else if (Score == 8) {
//      Grade = "C";
//    } else {
//      Grade = "D";
//    }
//    System.out.printf("당신의 점수는 %d점 이고, 학점은 %s 입니다.", Score, Grade);
//
  }

}
