package objectpackage;

class Phone {
  // 필드
  private String model = "";
  private int price;

  // 메서드
  void print() {
    System.out.println(price + "만원의 모델 " + model + "휴대폰 입니다. ");
  }
  public String getModel() { // 알트 + 인서트 (겟터 센터 자동 생성)
    return model;
  }

  public void setModel(String modelname) {
    model = modelname;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
