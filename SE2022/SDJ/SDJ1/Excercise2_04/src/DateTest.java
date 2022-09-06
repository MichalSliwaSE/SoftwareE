import rentalcompany.model.*;

import java.util.Scanner;

public class DateTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Input your day:");
    int day = input.nextInt();

    System.out.println("Input your month:");
    int month = input.nextInt();

    System.out.println("Input your year:");
    int year = input.nextInt();
    System.out.println(":");



    System.out.println("How many days do you want to skip:");
    int days = input.nextInt();

    MyDate date1 = new MyDate(day,month,year);

    System.out.println("Original date: " +date1);
    date1.stepForward(days);

    System.out.println("New date: " +date1);







  }
}
