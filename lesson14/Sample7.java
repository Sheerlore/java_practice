import java.io.*;

class Sample7 {
  public static void main(String[] args) {
    try {
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("text.txt")));

      pw.println("Hello");
      pw.println("GoodBye!");
      System.out.println("Write in file.");

      pw.close();
    } catch(IOException e) {
      System.out.println("error.");
    }
  }
}