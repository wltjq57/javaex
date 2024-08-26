package exercise_ch07;

import java.util.Arrays;

public class Mission3_3 {
  public static void main(String[] args) {
    Book[] books = {
        new Book(15000),
        new Book(50000),
        new Book(20000),
    };
    System.out.println("정렬전");
    for (Book book : books) {
      System.out.println(book);
    }
    System.out.println(Arrays.toString(books));
    Arrays.sort(books);
    System.out.println("정렬후");
    for (Book book : books) {
      System.out.println(book);
    }
  }
}

class Book implements Comparable{
  int price; // 필드

  public Book(int price) { //생성자
    this.price = price;
      }

  @Override
  public String toString() {
    return "Book{" +
        "price=" + price +
        '}';
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Book) {
      Book b = (Book) o;
      return this.price - b.price;
    }
    return -99999999;
  }
}

