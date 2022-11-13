public class Instance
{
    int num;
    Instance(int n)
    {
        num = n;
    }
    public void show()
    {
        System.out.println("The number is: " + num);
    }
    public static void main(String[] args)
    {
        Instance test = new Instance(75);
        test.show();
    }
}
