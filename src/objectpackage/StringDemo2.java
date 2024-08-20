package objectpackage;

public class StringDemo2 {
  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = "java";
    String s3 = new String("Html");

    int compareResult = s1.compareToIgnoreCase(s2); // 대소문자 구분없이 비교 후 true or false로 반환
    boolean equalResult = s1.equalsIgnoreCase(s2);
    if(compareResult == 0) System.out.println("compareResult : s1 과 s2 는 값이 같다.");
    if(equalResult) System.out.println("equalResult : s1 과 s2 는 값이 같다");
    System.out.println(compareResult);


//    System.out.println("동일비교(identity) s1 == s2 : " + (s1 == s2));
//    System.out.println("s1 == s3 : " + (s1 == s3));
//    System.out.println("동등비교(s1 equals s3) : " + s1.equals(s3));

//    s1 = s3;
//    System.out.println("동일비교(identity) s1 == s3 : " + (s1 == s3));
//    System.out.println("동등비교(s1 equals s3) : " + s1.equals(s3));

  }
}
