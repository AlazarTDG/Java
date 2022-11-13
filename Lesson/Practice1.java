public class Practice1
{
    public static void main(String[] args)
    {
        String x = "water";
        String y = "milk";
        String z;
        z = x;
        x = y;
        y = z;
        System.out.println(x);
        System.out.print(y);
    }
}