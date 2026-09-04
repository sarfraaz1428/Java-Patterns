public class Pattern11 {
  public static void main(String[] args) {
    int n = 5;
    // - upper half

    for (int i = 1; i <= n; i++) {
      // First Part

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      int space = 2 * (n - i);
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }

      // 2nd part

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Lower Half
    for (int i = n; i >= 1; i--) {
      // First Part

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      int space = 2 * (n - i);
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }

      // 2nd part

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

}
