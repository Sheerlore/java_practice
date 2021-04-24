package pa;

class Sample2 {
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.show();
  }
}

class Car {
  private int num;
  private double gas;

  public Car() {
    this.num = 0;
    this.gas = 0.0;
    System.out.println("Create Car!");
  }

  public void setCar(int n, double g) {
    this.num = n;
    this.gas = g;
    System.out.println("set num = " + this.num);
    System.out.println("set gas = " + this.gas);
  }

  public void show() {
    System.out.println("number is " + this.num);
    System.out.println("gasling is " + this.gas);
  }

}
