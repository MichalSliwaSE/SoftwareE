import rentalcompany.model.*;
public class DateTest
{
  public static void main(String[] args)
  {

  MyDate date1= new MyDate(14, 7, 1998);
  MyDate today= new MyDate(2,9,2022);
  int days  = date1.daysBetween(today);
  int years= date1.yearsBetween(today);
    System.out.println("Days since my birthday: "+ days);
    System.out.println("Years since birth: "+ years);



    MyDate birthday= new MyDate(14, 7, 1998);
    System.out.println("Java1date: "+ birthday);
  }
}