class S8 {
  public static void main(String[] args) {
    Car.showSum();
    Car c = new Car();
    c.show();

    Car.showSum();

    Car cc = new Car(1234, 12.9);
    cc.show();

    Car.showSum();
  }

}

class Car {
  public static int sum = 0;

  private int num;
  private double gas;
  
  public Car() {
    this.num = 0;
    this.gas = 0.0;
    sum++;
    System.out.println("Car is created");
  }

  public Car(int n, double g) {
    this();
    this.num = n;
    this.gas = g;
    System.out.println("Car is created!!!!!!");
  }
 
  public void setCar(int n) {
    this.num = n;
    this.show();
  }

  public void setCar(double g) {
    this.gas = g;
    this.show();
  }

  public void setCar(int n, double g) {
    this.num = n;
    this.gas = g;
    this.show();
  }

  public void show() {
    System.out.println("num = " + this.num);
    System.out.println("gas = " + this.gas);
  }

  public static void showSum() {
    System.out.println("cars total is " + sum);
  }
}