public class pattern6 {
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=(((i*(i-1))/2)+1);j<=((i*(i+1))/2);j++)
            {
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }
    }
}
