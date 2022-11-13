import java.util.Scanner;

public class Floating_Integer
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter fraction number: ");
        float num = a.nextFloat();
        int num1 = (int)num;
        float num2 = num1 - num;

        System.out.println("The float of the fraction is: "+num2);
        System.out.print("The integer of the fraction is: "+num1);
    }
}
