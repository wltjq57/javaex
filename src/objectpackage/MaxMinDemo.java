package objectpackage;

import java.util.Arrays;

public class MaxMinDemo {
  public static void main(String[] args) {
    int[] scores = {40, 30, 70, 90, 100};
    int max = findMax(scores);
    int min = findMin(scores);

    System.out.println(Arrays.toString(scores));
    System.out.println("배열의 최솟값은 " + min + " 최대값은 " + max + " 입니다. ");
  }

  private static int findMin(int[] s) {
    int min = s[0];
    for (int i = 1; i < s.length ; i++) {
      if(min > s[i]) min = s[i];

    }
    return min;
  }

  private static int findMax(int[] s) {
    int max = s[4];
    for (int i = 1; i > s.length ; i++) {
      if(max > s[i]) max = s[i];

    }
    return max;
  }
}
