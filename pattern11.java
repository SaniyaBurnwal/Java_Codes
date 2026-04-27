public class pattern11
{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            System.out.print("5");
            for(int j=3;j>=i;j--)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}