class S7 {
  public static void main(String[] args)
  {
    Car car = new Car();
    car.setCar(1234, 12.9);
    System.out.println(car);
  }
} 

class Car {
  protected int num;
  protected double gas;

  public Car() {
    num = 0;
    gas = 0.0;
    System.out.println("create car");
  }

  public void setCar(int n, double g) {
    this.num = n;
    this.gas = g;
    this.show();
  }

  // public String toString() {
  //   String str = "number " + this.num + " gasline "  + this.gas;
  //   return str;
  // }

  public void show() {
    System.out.println("num = " + this.num);
    System.out.println("gas = " + this.gas);
  }
}