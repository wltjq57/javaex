package objectpackage;

import java.util.Arrays;

public class StringArrayDemo {
  public static void main(String[] args) {
    String[] names = new String[3];



    names[0] = "hong kil-dong";
    names[1] = "son heung-min";
    names[2] = "lee kang-in";

    System.out.println(Arrays.toString(names));
    // foreach 문으로 배열의 각 원소의 길이를 출력하시오
    for (String name : names) { // iter를 이용해 양식 완성
      System.out.println(name.length());
    }
  }
}
