class S8 {
  public static void main(String[] args ){
    boolean bl = false;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (bl) {
          System.out.print("-");
          bl = false;
        } else {
          System.out.print("*");
          bl = true;
        }
      }

      System.out.print("\n");
    }
  }
}