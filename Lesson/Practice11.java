import javax.xml.namespace.QName;
import java.util.Scanner;
public class Practice11
{
    String name, name1;
   public static void part()
   {
       Scanner a = new Scanner(System.in);
       System.out.print("Enter your first name: ");
       String name = a.nextLine();
       System.out.print("Your first name is " + name);
   }
   public static void part1()
   {
       Scanner b = new Scanner(System.in);
       System.out.print("Enter the last name: ");
       String name1 = b.nextLine();
       System.out.println("Your first name is " + name1);
   }
   public static void full()
   {
       part();
       part1();
   }
   public static void main(String[] args)
   {
      full();

   }
}
