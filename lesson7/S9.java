import java.io.*;


class S9 {
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] test = new int[5];
    System.out.println("Enter " + test.length + "points");

    for(int i = 0; i < test.length; i++) {
      String str = br.readLine();
      test[i] = Integer.parseInt(str);
    }

    for(int i = 0; i < test.length - 1; i++)
    {
      for(int j = i + 1; j < test.length; j++)
      {
        if (test[j] > test[i]) {
          int tmp = test[i];
          test[i] = test[j];
          test[j] = tmp;
        }
      }
    }

    for (int i = 0; i < test.length; i++)
    {
      System.out.println(test[i]);
    }

  }

}