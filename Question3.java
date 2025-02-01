
public class Question3 {
  public static void main(String[] args) {
    int y = 3; // Number of Rows
    for (int i = 1; i <= y; i++) {
      for (int j = i; j < y; j++) {
        System.out.print("  ");
      }
      // Print the left side of stars
      for (int j = 1; j < i; j++) {
        System.out.print("* ");
      }
      // Print the middle numbers
      System.out.print(i + " ");
      // Print the Right Side Of Stars
      for (int j = 1; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}