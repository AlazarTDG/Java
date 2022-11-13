import java.util.Scanner;
public class Calculate
{
    double num2 , circle, rectangle, triangle;
    double z = 2;
    public void cal()
    {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double num = b.nextDouble();
        Scanner c = new Scanner(System.in);
        System.out.print("Enter the 2nd number: ");
        double num1 = c.nextDouble();
        rectangle = num * num1;
        circle = Math.PI*Math.pow(num,z);
        //num2 = Math.sqrt(Math.pow(num,z) - Math.pow(num1,z));
        triangle = (num1 * num)/2;

        System.out.println("\nThe area of a rectangle: " + (int) rectangle);
        System.out.println("The area of a circle: " + (int) circle);
        System.out.print("The area of a triangle: " + (int) triangle);
    }

    public static void main(String[] args)
    {
        Calculate test = new Calculate();
        test.cal();
    }
}
