import java.util.Scanner;
public class Up_Low
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter any character/letter: ");
        char word = a.next().charAt(0);
        if(word >= 'a' && word <= 'z')
        {
            System.out.print("\nThe letter you enter is lowercase: " + word);
        }
        else if(word >= 'A' && word <= 'Z')
        {
            System.out.print("\nThe letter you enter is Uppercase: " + word);
        }
        else
            System.out.print("\nError");
    }
}
