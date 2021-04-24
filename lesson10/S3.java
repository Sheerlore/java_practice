import java.io.*;


class S3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter strings");
    String str = br.readLine();

    System.out.println("Enter a search charactor");
    String str2 = br.readLine();
    char ch = str2.charAt(0);

    int num = str.indexOf(ch);
    if(num != -1) {
      System.out.println("find! " + num);
      System.out.println(str);

      for (int i = 0; i < num; i++) {
        System.out.print("-");
      }
      System.out.println(ch);
    } else {
      System.out.println("not charactor: " + ch);
      System.out.println(str);
    }


  }
}