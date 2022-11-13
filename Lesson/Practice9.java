import java.util.Scanner;
public class Practice9
{
    public void say()
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter your age:  ");

        int age = b.nextInt();

        System.out.print("Your name is " + name + " and age is " + age);


    }
    public static void main(String[] args)
    {
        Practice9 test = new Practice9();
        test.say();
    }
}