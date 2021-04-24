class S1 {
  public static void main(String[] args) {
    Vehicle[] vc = new Vehicle[2];

    vc[0] = new Car(1234, 20.5);
    vc[0].setSpeed(60);

    vc[1] = new Plane(232);
    vc[1].setSpeed(200);

    for (int i = 0; i < vc.length; i++) {
      vc[i].show();
    }

  }
}

abstract class Vehicle {
  protected int speed;
  public void setSpeed(int s) {
    this.speed = s;
    System.out.println("set speed: " + s);
  }

  abstract void show();
}

class Car extends Vehicle {
  private int num;
  private double gas;

  public Car(int n, double g) {
    this.num = n;
    this.gas = g;
    this.show();
  }

  public void show() {
    System.out.println("num is " + this.num);
    System.out.println("gas is " + this.gas);
    System.out.println("speed is " + this.speed);
  }
}

class Plane extends Vehicle {
  private int flight;

  public Plane(int f) {
    this.flight = f;
    this.show();
  }

  public void show() {
    System.out.println("flight is " + this.flight);
    System.out.println("speed is " + this.speed);
  }
}