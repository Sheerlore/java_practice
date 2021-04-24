class Sample5 {
  public static void main(String[] args) {
    Car car1 = new Car();
    try {
      car1.setCar(1234, -99);
    } catch(CarException e) {
      System.out.println(e + " throw");
    }
    car1.show();
  }
}

class CarException extends Exception {

}

class Car {
  private int num;
  private double gas;

  public Car() {
    this.num = 0;
    this.gas = 0.0;
    System.out.println("car created");
  }

  public void setCar(int n, double g) throws CarException {
    if (g < 0) {
      CarException e = new CarException();
      throw e;
    } else {
      this.num = n;
      this.gas = g;
      System.out.println("set num = " + this.num);
      System.out.println("set gas = " + this.gas);
    }
  }

  public void show() {
    System.out.println("number is " + this.num);
    System.out.println("gasline is " + this.gas);
  }
}