import java.util.Scanner;
public class StringTest
{
  public static void main(String[] args)

  {
    System.out.println("Input your line here:");
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();

    int lineLength = line.length();

    System.out.println("Lenght of the string is: " + lineLength);

    char firstCharacter = line.charAt(0);
    System.out.println("The first character is: " + firstCharacter);

    char lastCharacter = line.charAt(line.length() - 1);
    System.out.println("The last character is : " + lastCharacter);

    String upper = line.toUpperCase();
    System.out.println("Upper: " + upper);

    String lower = line.toLowerCase();
    System.out.println("Lower:" + lower);

    String subs = line.substring(0,5);
    System.out.println("First 5 letters:" + subs);

    String subs2 = line.substring(line.length() - 5);
    System.out.println("Last 5 letters:" + subs2);

    boolean ending = line.endsWith("abc");
    System.out.println("Does it end with abc? " + ending);

    String indd = String.valueOf(line.indexOf("a"));
    System.out.println("index of a:" + indd);

    String inddd = String.valueOf(line.indexOf("b"));
    System.out.println("index of a: " + inddd);

    String indddd = String.valueOf(line.indexOf("c")) ;
    System.out.println("index of c: " + indddd);

    String replace = line.replace('a','c');
    System.out.println("new line is: " + replace);












  }


}
