import java.util.Scanner;

public class Display
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the 1st integer: ");
        float num = a.nextFloat();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter the 2nd integer: ");
        float num1 = b.nextFloat();
        System.out.println("The sum of 2 number: "+ (num +num1));
        System.out.println("The difference of 2 number: "+ (num - num1));
        System.out.println("The product of 2 number: "+ (num * num1));
        System.out.println("The quotient of 2 number: "+ (num / num1));
        System.out.println("The modulation of 2 number: "+ (num % num1));
    }
}
