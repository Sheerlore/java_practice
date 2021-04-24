class S6 {
  public static void main(String[] args) {
    Car c = new Car(0000, 0.32);
    c.show();

    Car cc = new Car(1234, 12.9);
    cc.show();
  }

}

class Car {
  private int num;
  private double gas;
  
  // ここをpublicにすると初期化なしでオブジェクトを作成できる。
  // privateの場合引数を入れないとオブジェクトを作成できない。
  private Car() {
    this.num = 0;
    this.gas = 0.0;
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
}