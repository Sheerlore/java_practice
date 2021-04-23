class S1 {
  public static void main(String[] args) {
    int[] test;
    test = new int[5];
    
    for (int i = 0; i < 5; i++) {
      System.out.println(i + " " + test[i]);
    }

    test[0] = 80;
    test[1] = 30;
    test[2] = 40;
    test[3] = 60;
    test[4] = 70;

    for (int i = 0; i < 5; i++) {
      System.out.println(i + " " + test[i]);
    }
  }
}