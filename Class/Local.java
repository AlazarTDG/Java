public class Local
{
    public void show()
    {
        int num  = 100;
        System.out.println("The number is " + num);
    }
    public static void main(String[] args)
    {
        Local test = new Local();
        test.show();
    }
}
