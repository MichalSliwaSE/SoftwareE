import java.util.Scanner;
public class Tax
{
  public static void main (String[] args)

  {

    Scanner input = new Scanner(System.in);

    System.out.println("Total price of an item: ");
    double totalprice = input.nextDouble();

    double tax = totalprice * 0.25;
    double nettoprice = totalprice - tax;

    System.out.println(nettoprice);
    




  }
}
