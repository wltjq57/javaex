package objectpackage;

import java.util.Arrays;

public class ArrayDemo3 {
  public static void main(String[] args) {
    int[] num = {10, 20, 30};
    System.out.println(num);


    for (int i = 0; i < num.length; i++) {
      if (i != num.length - 1)
        System.out.print(num[i] + ",");
      else
        System.out.println(num[i]);
    }
    System.out.println(Arrays.toString(num)); // 배열의 요소를 출력할 수 있다.

    // num 배열의 크기를 5로 변경
    int[] newNum = new int[5];
    // step1 : 크기를 3에서 5로 증가
    for (int i = 0; i < newNum.length; i++) {
      if (i != newNum.length - 1)
        System.out.print(newNum[i] + ",");
      else
        System.out.println(newNum[i]);
    }
    System.out.println(Arrays.toString(newNum));

    // step2 : num 배열의 요소들을 newNum으로 복사
    for (int i = 0; i < num.length; i++) {
      newNum[i] = num[i];
    }

    // step3 : newNum을 num이 참조하도록 한다.
    num = newNum;
    for (int i = 0; i < num.length; i++) {
      if (i != num.length - 1)
        System.out.print(num[i] + ",");
      else
        System.out.println(num[i]);
    }
    System.out.println(Arrays.toString(newNum));
  }
}
