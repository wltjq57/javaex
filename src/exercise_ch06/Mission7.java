package exercise_ch06;

public class Mission7 {
  public static void main(String[] args) {
    Person p = new Person("길동이", 22);
    p.show();

    Student s = new Student("황진이",23,100);
    s.show();

    ForeignStudent f = new ForeignStudent("Amy",30,200,"U.S.A");
    f.show();

  }
}

class Person {
    String name; // 필드
    int age;

  void show() { // 메서드
    System.out.println("사람[이름 : " + name + ", 나이 : " + age+"]");
  }

  Person(String name, int age) { // 생성자
    this.name = name;
    this.age = age;
  }
}

class Student extends Person {
  int number; // 필드

  void show() { // 메서드
    System.out.println("사람[이름 : " + name  +", 나이 : " + age + ", 학번 : " + number+"]");
  }

  Student(String name, int age, int number) { // 생성자
    super(name,age);
    this.number = number;
  }
}

class ForeignStudent extends  Student {
   String country; // 필드

  void show() { // 메서드
    System.out.println("사람[이름 : " + name +", 나이 : " + age + ", 학번 : " + number + ", 국적 : " + country +"]");
  }

  ForeignStudent(String name, int age, int number, String country) { // 생성자
    super(name, age, number);
    this.country = country;
  }
}


