import java.io.*;

class S10 { 
  public static void main(String[] args) throws IOException
  {
    System.out.println("Please enter your grades (1~5)");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    switch(res) {
      case 1:
      case 2:
        System.out.println("Let's try a little harder");
        break;
      case 3:
      case 4:
        System.out.println("Let's keep working at this rate");
        break;
      case 5:
        System.out.println("perfect!");
        break;
    }

  }
}