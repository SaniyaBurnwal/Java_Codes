public class pattern12
{
    public static void main(String args[])
    {
        for(int i=2;i<=16;i=i*2)
        {
            for(int j=16;j>=i;j=j/2)
            {
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }
    }
}