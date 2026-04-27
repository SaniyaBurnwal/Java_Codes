public class pattern15 {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==2 || i==4)
                System.out.print(" "+j);
                else
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
