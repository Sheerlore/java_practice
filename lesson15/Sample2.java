class Sample2 {
  public static void main(String[] args) {
    Car car1 = new Car("one");
    car1.start();

    Car car2 = new Car("two");
    car2.start();

    for(int i = 0; i < 5; i++) {
      System.out.println("main() process");
    }
  }
}

class Car extends Thread {
  private String name;
 
  public Car(String nm) {
    this.name = nm;
  }

  public void run() {
    for(int i = 0; i < 5; i++) {
      System.out.println(name + " is go.");
    }
  }
}