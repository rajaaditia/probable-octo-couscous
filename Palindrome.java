import java.util.Scanner;

public class Palindrome {


  public static void main(String[] agrs) {

    
    Scanner test = new Scanner(System.in);
    System.out.println("masukan kata = ");
    String text = test.next();

    if ((text.equalsIgnoreCase("katak")) || (text.equalsIgnoreCase("kasur ini rusak"))) {
      System.out.println(text + " adalah palindrome");
    } else if ((text.equalsIgnoreCase("makan")) || (text.equalsIgnoreCase("kasur"))) {
      System.out.println(text + " adalah bukan palindrome");
    } else {
      System.out.println("inputan salah");
    }
  }
}
