import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        double result;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double num = x.nextDouble();
        Scanner z = new Scanner(System.in);
        System.out.print("Choose an operator using sign: ");
        char cal = z.next().charAt(0);
        Scanner y = new Scanner(System.in);
        System.out.print("Enter your second number: ");
        double num1 = y.nextDouble();

        switch (cal)
        {
            case '+':
                result = num + num1;
                System.out.print("\nThe addition of the two number is " + result);
                break;
            case '-':
                result = num - num1;
                System.out.print("\nThe addition of the two number is " + result);
                break;
            case '*':
                result = num * num1;
                System.out.print("\nThe addition of the two number is " + result);
                break;
            case '/':
                result = num / num1;
                System.out.print("\nThe addition of the two number is " + result);
                break;
            default:
                System.out.print("\n\nYou enter the wrong operation");
        }
    }
}
