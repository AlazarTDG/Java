import java.util.Scanner;

public class Practice4
{
    public static void main (String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.print("Enter the 2nd number: ");
        int num2 = y.nextInt();

        int num3, num4;
        num3 = num1 + num2;
        num4 = num3/2 +3;

        System.out.println("The sum of this integer is: " + num3);
        System.out.println("The fraction of this number: " + num4);
    }
}