package exercise_ch08;

import java.util.Random;

public class Mission4 {
  public static void main(String[] args) {
//   1. Math.random을 이용하여 풀기

//    int num = (int)(Math.random()*6) + 1;
//
//    if(num==1) {
//      System.out.println(1);
//    } else if (num==2){
//      System.out.println(2);
//    } else if (num==3){
//      System.out.println(3);
//    } else if (num==4){
//      System.out.println(4);
//    } else if (num==5){
//      System.out.println(5);
//    } else {
//      System.out.println(6);
//    }

//    --------------------------------------
//   2. random 클래스의 메서드를 이용
    for (int i = 0; i < 10; i++) {
      System.out.print(new Dice().roll());
    }
  }
}

class Dice {
  Random random = new Random();

  int roll() {
    return random.nextInt(1,7);

  }
}
