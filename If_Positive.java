import java.util.Scanner;
public class If_Positive
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double num = x.nextDouble();

        if (num>0)
        {
            System.out.print("\nThe number is Positive");
        }
    }
}
