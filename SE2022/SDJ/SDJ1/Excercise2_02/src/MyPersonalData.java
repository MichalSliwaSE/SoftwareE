import java.util.Scanner;
public class MyPersonalData
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Input your name here:");
    String name = input.nextLine();

    System.out.println("Input your age here:");
    int age = input.nextInt();
    input.nextLine();

    System.out.println("Input your adress here:");
    String adress = input.nextLine();

    System.out.println("Your name is " + name + " and your age is: " + age + "and your home is: " + adress);


    input.close();
  }
}



