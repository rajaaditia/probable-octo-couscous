public class Looping1 {

  public static void main(String[] agrs) {
    int a = 1;
    while (a < 8) {
      System.out.println(a);
      a++;
      if (a == 3 && a < 4) {
        System.out.println(a + 1);
      }
      if (a == 5 && a < 6) {
        System.out.println(a + 1);
      }
      if (a == 7 && a < 8) {
        System.out.println(a + 1);
      }
    }
  
    System.out.println("---------");
    int i = 1;
    while (i <= 3) {
      System.out.println(i);
      if (i < 3) {
        i++;
        continue;
      }
      int j = i + i;
      System.out.println(j);
      i++;
      int k = i + j + 1;
      System.out.println(k);
      i++;
      int l = j + k + 3;
      System.out.println(l);
      i++;
      int m = k + l + 6;
      System.out.println(m);
      i++;
      int n = l + m + 11;
      System.out.println(n);
      i++;
    }
  }
}
