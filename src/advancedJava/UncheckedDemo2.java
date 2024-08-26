package advancedJava;

public class UncheckedDemo2 {
  public static void main(String[] args) {
    int[] array = {1,2,3};
    int[] array2 = null;

    try {
      int result = 3/0; // 3번째 sout
      System.out.println(result);
//      System.out.println(array[3]);  // 1번째 sout
      System.out.println(array2[3]);   // 2번째 sout
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("인덱스 범위를 벗어났습니다");
    } catch (NullPointerException e) {
      System.out.println("배열이 정상적으로 생성되지 않았습니다.");
    } catch (ArithmeticException e) {
      System.out.println("0 으로 나눌 수 없습니다.");
    }
    System.out.println("프로그램 종료");
  }
}
