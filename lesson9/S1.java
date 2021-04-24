class S1 {
  public static void main(String[] args)
  {
    Car car1 = new Car();
    car1.num = 1234;
    car1.gas = 20.5;
    car1.show();
  }
}

class Car {
  int num;
  double gas;

  void show() {
    System.out.println("num is " + this.num);
    System.out.println("gas is " + this.gas);
  }
}