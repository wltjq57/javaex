package intermediateJava;

public class UpcastindDowncastingDemo {
  public static void main(String[] args) {
    Student s = new Student();
    Person p = s; // 자동 형변환, UpCasting (자손타입을 조상타입으로 형 변환)
    String name = p.name;
    p.whoami();
    Student s2 = (Student) p;
    int number = s2.number;
    s2.work();
  }
}
