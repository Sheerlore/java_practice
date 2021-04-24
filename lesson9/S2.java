class S2 {
  public static void main(String[] args)
  {
    Car car1 = new Car();
    car1.setNumGas(1234, 20.5);

    car1.setNumGas(1234, -123);
    car1.show();
  }
}

class Car {
  private int num;
  private double gas;

  public void setNumGas(int n, double g) {
    if (g > 0 && g < 1000) {
      this.num = n;
      this.gas = g;
      System.out.println("set num and gas ");
      this.show();
    } else {
      System.out.println(g + " is a wrong.");
      System.out.println("not change gas.");
    }
  }

  public void show() {
    System.out.println("num is " + this.num);
    System.out.println("gas is " + this.gas);
  }
}