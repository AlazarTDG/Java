import java.util.Scanner;
public class Practice2
{
    public static void main (String[] args)
    {
        Scanner name = new Scanner (System.in);
        System.out.print("what is your name:");
        String name1 = name.nextLine();
        Scanner age = new Scanner(System.in);
        System.out.print("What is your age:");
        int age1 = age.nextInt();
        System.out.println("Your name is " + name1 + " and your age is " + age1);

    }
}