class S3 { 
  public static void main(String[] args)
  {
    int[] test = new int[5];

    for (int i = 0; i < 5; i++ ) {
      test[i] = i * i * i;
    }

    for (int i = 0; i < 5; i++ )
    {
      System.out.println(i + " " + test[i]);
    }
  }
}