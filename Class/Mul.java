import java.util.Scanner;

public class Mul
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double num = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter the 2nd number: ");
        double num1 = b.nextDouble();
        double mul;
        mul = num * num1;
        System.out.print("The multiplication of 2 number is: "+mul);
    }
}
