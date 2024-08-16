package objectpackage;

public class ColoredCircleDemo {
  public static void main(String[] args) {
    ColoredCircle cc1 = new ColoredCircle();
    System.out.printf("1번 원의 반지름과 색은 %d, %s 입니다. \n" , cc1.r, cc1.color);
    System.out.println(cc1.numOfCircles);
    cc1.showStatus();

    ColoredCircle cc2 = new ColoredCircle("");
    System.out.printf("2번 원의 반지름과 색은 %d, %s 입니다. \n" , cc2.r, cc2.color);
    System.out.println(cc1.numOfCircles); // cc2와 같은 결과
    cc2.showStatus();

    ColoredCircle cc3 = new ColoredCircle(10);
    System.out.printf("3번 원의 반지름과 색은 %d, %s 입니다. \n" , cc3.r, cc3.color);
    System.out.println(cc1.numOfCircles); // cc3와 같은 결과
    cc3.showStatus();

    ColoredCircle cc4 = new ColoredCircle(10,"red");
    System.out.printf("4번 원의 반지름과 색은 %d, %s 이고, %d 번째로 생성된 원입니다. \n" , cc4.r, cc4.color, cc4.numOfCircles);
    cc4.showStatus();

  }
}

class ColoredCircle {
  // 멤버 - 필드
  static int numOfCircles;
  int r ; // static 이 안붙은것이 인스턴스 변수
  String color;

  // 생성자 - 4개(오버로딩)
  public ColoredCircle() {
    this(1,"white");
  }

  public ColoredCircle(String color) {
    this(1,color);
  }

  public ColoredCircle( int r){
    this(r, "white");
    }

  public ColoredCircle( int r, String color){
     if (r > 0) {
        this.r = r;
      } else {
        this.r = 1;
      }
      if (color == null || color.equals("") || color.equals(" ")) {
        this.color = "white";
      } else {
        this.color = color;
      }
      numOfCircles++;
  }

  // 멤버 - 메서드
  public static void showStatus() {// 정적 메서드 static 키워드에는 this를 사용할 수 없다
    System.out.println( numOfCircles + "번째 원이 생성되었습니다.");
    //setColor("red");
    getNumOfCircles();
  }

  public static int getNumOfCircles() {
    return numOfCircles;
  }

  public void setColor(String color){// 인스턴스 메서드
    this.color = color;
  }
}

