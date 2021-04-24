import java.io.*;


class S2 {
  public static void main(String[] args) throws IOException {
    System.out.println("Enter English word");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    String stru = str.toUpperCase();
    String strl = str.toLowerCase();

    System.out.println(stru);
    System.out.println(strl);


  }
}