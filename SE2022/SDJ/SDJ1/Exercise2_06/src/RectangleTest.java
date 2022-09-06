import java.util.Scanner;

public class RectangleTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter rectangle length: ");
    Double length= input.nextDouble();

    System.out.println("Enter rectangle width: ");
    Double width= input.nextDouble();

    Rectangle dude = new Rectangle(length,width);

    System.out.println("Rectangle length is: " + dude.getLength());
    System.out.println("Rectangle width is: " + dude.getWidth());

    System.out.println("area of recrangle is" + dude.getArea());













  }
}
