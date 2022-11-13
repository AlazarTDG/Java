import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double num = x.nextDouble();
        System.out.print("Enter the 2nd number: ");
        double num1 = x.nextDouble();
        System.out.print("Enter the 3rd number: ");
        double num2 = x.nextDouble();
        double sum = num + num1 + num2;

        if (sum == 180)
        {
            System.out.print("The number you entered is prefect triangle");
        }
        else
        {
            System.out.print("The number you entered isn't a prefect triangle");
        }
    }
}
