import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter student 1 mark: ");
        float num = a.nextFloat();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter student 2 mark: ");
        float num1 = b.nextFloat();
        Scanner c = new Scanner(System.in);
        System.out.print("Enter student 3 mark: ");
        float num2 = c.nextFloat();

        float average;
        average = ( num + num1 + num2)/3;
        System.out.print("The average of 3 students marks is: "+average);
    }
}
