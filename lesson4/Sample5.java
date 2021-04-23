class Sample5 {
  public static void main(String[] args) {
    int a = 0;
    int b = 0;
    int c = 0;

    b = a++;
    c = ++a;

    System.out.println(b + " " + c);
  }
} 