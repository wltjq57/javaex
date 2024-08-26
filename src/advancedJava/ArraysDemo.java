package advancedJava;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    Integer[] intArray = {2,4,6,8,10}; //new Integer[5];
    String[] strArray = {"사과", "도넛", "바나나"};
    int[] iArray = new int[5];

//    System.out.println(intArray);
//    System.out.println(strArray);
//    System.out.println(iArray);

    // { }안에 값을 가져옴
    System.out.println(Arrays.toString(intArray));
    System.out.println(Arrays.toString(strArray));
    System.out.println(Arrays.toString(iArray));

    System.out.println(Arrays.binarySearch(intArray, 10)); // 4번재 배열에 있음
  }
}
