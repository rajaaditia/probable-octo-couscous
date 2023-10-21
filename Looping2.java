public class Looping2 {

  public static void main(String[] agrs) {
    int i = 1;
    while (i < 11) {
      System.out.println(i);
      i++;
      if (i == 4) {
        System.out.println(i);
        System.out.println("-----");
      }
      if (i > 4 && i < 5) {
        System.out.println(i);
        System.out.println("-----");
      }
      if (i >= 7 && i < 8) {
        System.out.println(i);
        System.out.println("-----");
      }
    }
  }
}
