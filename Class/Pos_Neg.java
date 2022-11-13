import java.util.Scanner;

public class Pos_Neg
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double num = a.nextDouble();

        if(num > 0)
        {
            System.out.print("\nThe number is Positive: " + num);
        }
        else if (num < 0)
        {
            System.out.print("\nThe number is Negative: " + num);
        }

        else if(num == 0)
        {System.out.print("\nThe number is zero"+ num);}
        else
            System.out.println("Error");
    }
}
