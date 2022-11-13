import java.util.Scanner;
public class Practice7
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.print("Enter the 2nd number: ");
        int num1 = y.nextInt();
        boolean value = num > num1;
        System.out.print("The value is " + value);
    }
}