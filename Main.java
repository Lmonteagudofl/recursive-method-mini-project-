class Main {
  public static void main(String[] args) {
    minusOne(3);
    System.out.println("We are going to be racing cars today!! On My Mark!");
    System.out.println("We are going to be racing cars today!! O");
  }

  public static void minusOne(int n) {
    if (n == 0) {
      System.out.println("GO!");
    } else {
      System.out.println(n);
      n--;
      minusOne(n);
      }
    }
  }