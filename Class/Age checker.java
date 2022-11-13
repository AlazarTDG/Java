import java.util.Scanner;
public class Age
{
    public static void main(String[] args)
    {
        System.out.println("\n                                    Age       |      Category      ");
        System.out.println("                              _____________________________________");
        System.out.println("                                   0 - 3      |      No School     ");
        System.out.println("                                   4 - 6      |      KG School     ");
        System.out.println("                                   7 - 14     |      Elementary School     ");
        System.out.println("                                  15 - 18     |      High School    ");
        System.out.println("                                  19 - 22     |      University     ");
        System.out.println("                                  23 - 100    |      Career     \n\n");


        Scanner x = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = x.nextLine();
        Scanner y = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = y.nextInt();

        if (age >=0 && age <= 100)
        {
            if (age >= 0 && age <= 3) {
                System.out.print("\nNo school for " + name);
            } else if (age >= 4 && age <= 6) {
                System.out.print("\n" + name + " can enter KG School");
            } else if (age >= 7 && age <= 14) {
                System.out.print("\n" + name + " can enter Elementary School");
            } else if (age >= 15 && age <= 18) {
                System.out.print("\n" + name + " can enter High School");
            } else if (age >= 19 && age <= 22) {
                System.out.print("\n" + name + " can enter University");
            } else
                System.out.print("\n" + name + " start career");
        }
        else
        {
            System.out.print("\nYou're older than usual");
        }
    }
}
