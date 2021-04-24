class S4 {
  public static void main(String[] args ) {
    Car c = new Car(1234, 22.3);
    c.vShow();
    c.mShow();
  }
}
interface iVehicle {
  void vShow();
}

interface miMaterial {
  void mShow();
}

class Car implements iVehicle, miMaterial {
  private int num;
  private double gas;

  public Car(int n, double g) {
    this.num = n;
    this.gas = g;
    this.vShow();
  }

  public void vShow() {
    System.out.println("num = " + this.num);
    System.out.println("gas = " + this.gas);
  } 

  public void mShow() {
    System.out.println("material is iron");
  }
}
