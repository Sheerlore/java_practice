class S3 {
  public static void main(String[] args) {
    Car c = new Car();
    c.setCar(1234, 22.5);
    c.setCar(2222);
    c.setCar(12.5);
  }

}

class Car {
  private int num;
  private double gas;
 
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
}