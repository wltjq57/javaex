package basic;

import java.util.Scanner;

public class MultiIfDemo {
  public static void main(String[] args) {
//   10은 A 9=B 8=C 1~7=D

//    Scanner in = new Scanner(System.in);
//    System.out.println("점수를 입력해주세요 ( 1~10 )");
//    int Score = in.nextInt();
//    String Grade = "";
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

//    90~100 = A 80~89 =B 70~79 =C 1~69 =D

    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력해주세요 ( 1~100 )");

    int Score = in.nextInt();

    String Grade = "";
    if (Score >= 90) {
      if (Score >= 95) {
        Grade = "A+";
      } else {
        Grade = "A0";
      }
    } else if (Score < 90 && Score >= 80 ) {
      Grade = "B";
    } else if (Score < 80 && Score >= 70 ) {
      Grade = "C";
    } else {
      Grade = "D";
    }
    System.out.printf("당신의 점수는 %d점 이고, 학점은 %s 입니다.", Score, Grade);

  }
}
