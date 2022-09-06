import rentalcompany.model.*;

import java.util.Scanner;

public class EngineTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("type =");
    String type= input.nextLine();

    System.out.println("horse power =");
    int horsepower = input.nextInt();

    System.out.println("Volume in m3 = ");
    int volume = input.nextInt();


    System.out.println("Is it Diesel (true/false) = ");
    boolean isDiesel = input.nextBoolean();







    Engine porshe = new Engine(type,horsepower,volume,isDiesel);

    System.out.println("porshe:" + porshe.toString());



  }
}
