package basic;

import java.util.Scanner;

public class WhileDemo2 {
  public static void main(String[] args) {
    // 점수를 입력받아서 해당 점수의 Grade를 매기는 프로그램
    // 10 = A 9 = B 0~8 = C

    Scanner in = new Scanner(System.in);
    while(true) {
      System.out.println("점수를 입력해주세요 ( 1~10 )");
      int Score = in.nextInt();

      if(Score < 0) break;

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
        default :
          Grade = "C";
          System.out.println(Grade);
      }
    }

  }
}
