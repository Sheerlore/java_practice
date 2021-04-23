import java.io.*;


class S4 {
  public static void main(String[] args) throws IOException
  {
    System.out.println("Enter a integer");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    if (res == 1) {
      System.out.println("input 1");
    } else if(res == 2) {
      System.out.println("input 2");
    } else {
      System.out.println("other number");
    }

    System.out.println("end");
  }
}