package objectpackage;

import java.util.Arrays;

public class Mission4 { // 가위바위보를 랜덤으로 출력
  public static void main(String[] args) {
    String[] name = {"가위", "바위", "보"};
    System.out.println(name);
    System.out.println(Arrays.toString(name));

    for (int i = 0; i < 10; i++) {
      System.out.println(name[(int)(Math.random() * 3)]); // Math.random은 double 3은 int -> int로 만들어주기위한 형 변환
    }

  }
}
