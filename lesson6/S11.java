import java.io.*;

class S9 { 
  public static void main(String[] args) throws IOException
  {
    System.out.println("How many do you want to loop ghrough?(1~10)");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    for (int i = 0; i <= 10; i++) {
      if (i == res) continue;
      System.out.println(i);
    }


  }
}