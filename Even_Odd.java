import java.util.Scanner;
public class Even_Odd
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double num = a.nextDouble();
        double num1 = num%2;
        if(num1 == 0)
        {
            System.out.print("The number is even");
        }
        else if (num1 ==1)
        {
            System.out.print("The number is odd");
        }
        else
            System.out.print("Error");
    }
}
