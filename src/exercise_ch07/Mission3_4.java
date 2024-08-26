package exercise_ch07;

import java.util.Arrays;

public class Mission3_4 {
  public static void main(String[] args) {
    Person[] persons = {
        new Person("홍길동",32,170,75),
        new Person("박지성",40,175,68),
        new Person("손흥민",20,180,70)
    };
//    for (Person person : persons) {
//      System.out.println(person);
//    }

    Arrays.sort(persons);
    for (Person person : persons) { // 나이가 어린순으로 출력
      System.out.println(person);
    }
  }
}

class Person implements Comparable{
  int age, height, weight;
  String name;

  public Person(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;

  }

  @Override
  public String toString() {
    return "Person[" +
        "이름=" + name + ", 나이=" + age + ", 키=" + height + ", 몸무게=" + weight +"]";
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Person) {
      Person p = (Person) o;
      return p.age - this.age; // 나이 내림차순으로 정렬
    }
    return 0;
  }
}
