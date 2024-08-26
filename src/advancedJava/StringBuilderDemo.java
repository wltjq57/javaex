package advancedJava;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.capacity());
    sb.append("hello");
    sb.append(" world");

    String result = sb.toString();
    System.out.println(result); // hello world 출력
    System.out.println(result.length());

    String reverse = sb.reverse().toString();
    System.out.println(reverse); // hello world 뒤집어서 출력
    System.out.println(sb.capacity());
  }
}
