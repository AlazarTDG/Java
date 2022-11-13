import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
        System.out.print("This code will calculate your grade for Fundamental Programming.");
        Scanner y = new Scanner(System.in);
        System.out.print("\n\nEnter your name: ");
        String name = y.nextLine();
        Scanner x = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        double grade = x.nextDouble();
        char[] letter = {'A', 'B', 'C','D','F'};
        String[] message = {"Excellent", "Very Good", "Good", "Satisfactory", "Fail"};

        if (grade >= 0 && grade <= 100)
        {
            if (grade >= 85 && grade <= 100)
            {
                System.out.print("\n\n"+ name + " fundamental programming grade " + " is " + letter[0] + " and "+ message[0]);
            }
            else if (grade >= 70 && grade <= 84)
            {
                System.out.print("\n\n"+ name + " fundamental programming grade " + " is " + letter[1]  + " and "+ message[1]);
            }
            else if (grade >= 55 && grade <= 69)
            {
                System.out.print("\n\n"+ name + " fundamental programming grade " + " is " + letter[2] + " and " + message[2]);
            }
            else if (grade >= 45 && grade <= 54)
            {
                System.out.print("\n\n"+ name + " fundamental programming grade " + " is " + letter[3] + " and " + message[3]);
            }
            else
            {
                System.out.print("\n\n"+ name + " fundamental programming grade " + " is " + letter[4] + " and " + message[4]);
            }
        }
        else
        {
            System.out.print("Incorrect format");
        }
    }
}
