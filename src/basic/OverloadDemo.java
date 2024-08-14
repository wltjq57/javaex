package basic;

public class OverloadDemo {
  public static void main(String[] args) {
    // method의 이름은 longAdd , 매개변수는 2개이고 데이터타입은 long
    // 반환타입은 long
    // add(2,3) 출력 ; add(10,20) 출력; add(100,200)출력

    // method의 이름은 longMinus , 매개변수는 2개이고 데이터타입은 long
    // 첫번째 매개변수에서 두번째 매개변수를 빼서 그 결과를 반환하는 메서드를 만들어라
    // 반환타입은 int
    // minus(2,3) 출력 ; minus(20,10) 출력; minus(200,100)출력

    // method의 이름은 longMultiply , 매개변수는 2개이고 데이터타입은 int
    // 첫번째 매개변수에서 두번째 매개변수를 빼서 그 결과를 반환하는 메서드를 만들어라
    // 반환타입은 long
    // multiply(2_000_000,1_000_000) 출력 ;

    // method의 이름은 doubleDivide , 매개변수는 2개이고 데이터타입은 int
    // 첫번째 매개변수에서 두번째 매개변수를 빼서 그 결과를 반환하는 메서드를 만들어라
    // 반환타입은 double (출력시에 소숫점 4째자리까지 해달라)
    // divide(2,3) 출력 ; 0.6666

    int a = 1, b =2;
    long long1 =1L , long2 =2L ;
    double da = 1.0, db = 2.0;
    System.out.println(add(long1,long2));
    System.out.println(minus(long1,long2));

    System.out.println(add(a,b));
    System.out.println(minus(a,b));
    System.out.println(multiply(a,b));
    System.out.println(multiply(long1,long2));
    System.out.println(divide(a,b));
    System.out.printf("%.4f \n", divide(da,db));

    int result = add(2,3);
//    System.out.println(result);

    result = add(10, 20);
//    System.out.println(result);

    result = add(100, 200);
//    System.out.println(result);

    int result1 = minus(2,3);
//    System.out.println(result1);

    result1 = minus(20, 10);
//    System.out.println(result1);

    result1 = minus(200, 100);
//    System.out.println(result1);

    int result2 = multiply(2,3);
//    System.out.println(result2);

    result2 = multiply(20, 10);
//    System.out.println(result2);

    result2 = multiply(200, 100);
//    System.out.println(result2);

    int result3 = divide(2,3);
//    System.out.println(result3);

    result3 = divide(20, 10);
//    System.out.println(result3);

    result3 = divide(200, 100);
//    System.out.println(result3);
  }

  public static int add(int num1, int num2) {
    return  num1 + num2 ;
  }

  public static long add(long num1, long num2) {
    return  num1 + num2 ;
  } // 기존의 longAdd 였으나 오버로딩이 성립되어 add로도 가능

  public static int minus(int num1, int num2){
    return num1 - num2 ;
  }

  public static long minus(long num1, long num2) {
    return  num1 - num2 ;
  } // 기존의 longMinus 였으나 오버로딩이 성립되어 minus로도 가능

  public static int multiply(int num1, int num2){
    return num1 * num2 ;
  }

  public static long multiply(long num1, long num2){
    return num1 * num2 ;
  } // 기존 Multiply를 변경하고 int num를 long으로 변경하여 오버로딩 가능

  public static int divide(int num1, int num2){
    if(num2 ==0) return 0;
    return num1 / num2 ;
  }

  public static double divide(double num1, double num2){ // 오버로딩 성립
    if(num2 == 0) return 0;
    return num1 / (double)num2 ;

  }
}
