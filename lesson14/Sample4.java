class Sample4 {
  public static void main(String[] args) {
    try {
      int[] test;
      test = new int[5];
      System.out.println("input test[10]");

      test[10] = 80;
      System.out.println("end");
    }catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("配列の要素を超えています。");
      System.out.println(e + "occured");
    } finally {
      System.out.println("Always finish this process at the end.");
    }

    System.out.println("safe end");
  }
}