package objectpackage;

public class StringDemo3 {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = ", Java";

    s1 = "hello";

    System.out.println("s1의 길이는 " + s1.length());
    String concat = s1.concat(s2);
    System.out.println(s1.concat(s2)); // concat = s1 + s2 = hello, Java

    System.out.println(s1.toUpperCase()); // 모두 대문자로 변경 HELLO
    System.out.println(s1);

    System.out.println(s2.substring(2)); // ,부터가 아닌 J부터 시작
    System.out.println(s2.substring(2,4)); // J부터 시작하여 a에서 끝남

    System.out.println(String.valueOf(10).equals("10"));

  }
}
