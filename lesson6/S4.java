import java.io.*;


class S4 {
  public static void main(String[] args) throws IOException {
    System.out.println("How many totals do you want to find?");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int num = Integer.parseInt(str);

    int sum = 0;
    for(int i = 1; i <= num; i++) {
      sum += i;
    }


    System.out.println("sum = " + sum);
  }
}