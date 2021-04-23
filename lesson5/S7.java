import java.io.*;

class S7 {
  public static void main(String[] args) throws IOException
  {
    System.out.println("You are man?");
    System.out.println("Enter Y or N ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    char res = str.charAt(0);

    if (res == 'Y' || res == 'y') {
      System.out.println("You are man");
    } else if (res == 'N' || res == 'n') {
      System.out.println("You are woman");
    }else {
      System.out.println("Enter Y or N");
    }
  }
}