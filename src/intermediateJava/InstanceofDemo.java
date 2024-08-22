package intermediateJava;

public class InstanceofDemo {
  public static void main(String[] args) {
    Student s =new Student();
    Person p = new Person();

    System.out.println(s instanceof Student);
    System.out.println(s instanceof Person);
    System.out.println(s instanceof Object);

    downcast(s);
    
  }

  private static void downcast(Object o) {
    if (o instanceof Student) {
      Student s = (Student) o;
      System.out.println(s.number);
      s.work();
    }
  }
}
