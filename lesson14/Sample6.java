import java.io.*;

class Sample6 {
  public static void main(String[] args) {
    System.out.println("input strings");

    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      System.out.println(str + " inputed.");
    } catch(IOException e) {
      System.out.println("io error.");
    }
  }
}