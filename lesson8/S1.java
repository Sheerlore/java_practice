class S1 {
  public static void main(String[] args) {
    Car car1;
    car1 = new Car();

    car1.num = 1234;
    car1.gas = 20.5;

    System.out.println("number is " + car1.num);
    System.out.println("gas is " + car1.gas);
  }
}

class Car {
  int num;
  double gas;
}