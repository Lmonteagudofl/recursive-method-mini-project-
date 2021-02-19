import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    System.out.println("We are going to be racing cars!!");
    System.out.println("Are you ready? reply Yes or no");
    String name =  scan.next();

    System.out.println("On My Mark!!");
    System.out.println("Get set!!");

    
    int result = minusOne(3);

    //System.out.println(result);
    System.out.println("GO!");

  }

  public static int minusOne(int n) {
    if (n == 0) {

    } else {
      System.out.println(n);
      n--;
      minusOne(n);
    }
    return 1; 
  }
}
