package basic;

public class AdderDemo {
  public static void main(String[] args) {
    int i = 0, j ;
    j = i++; // 후위연산자 , i가 0인걸 j에 넘기고 i는 1증가 j=0 i=1
//    j= ++i; // 전위연산자, i의 값을 증가 후 j에 넘김   i=1 j=1
    System.out.printf("i = %d, j = %d \n", i, j);

    int x = 0, y;
    y= ++x;
    System.out.printf("x = %d, y = %d", x, y);

  }
}
