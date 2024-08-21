package objectpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Mission3 { // www.java.com을 입력했을때 com으로 끝나는지 java를 포함하는지 bye를 입력하면 프로그램 종료
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String s = "";
    while (true) {
      System.out.println("URL을 입력하세요 : ");
      s = in.nextLine();
      String sLow = s.toLowerCase(); // 대소문자 상관없이 만듬

      if(sLow.equals("bye")) break;
      if (sLow.contains("java")) {
        System.out.println("java를 포함합니다.");
      };
      if (sLow.endsWith("com")); {
        System.out.println("com으로 끝납니다.");
      }
    }
  }
}
