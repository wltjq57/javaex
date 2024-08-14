package objectpackage;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone p1 = new Phone(); // 컨트롤 알트 v (앞에 Phone p1 자동 생성)
    p1.setModel("갤럭시 Z 폴드 6");
    p1.setPrice(256);
    p1.print();

    Phone p2 = new Phone();
    p2.setModel("iPhone 15 Pro");
    p2.setPrice(232);
    p2.print();
  }
}
