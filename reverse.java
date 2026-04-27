class reverse
{
    public static void main(String args[])
    {
        String word="java";
        String reword="";
        int l=word.length();
        for(int i=l-1;i>=0;i--)
        {
        char ch=word.charAt(i);
         reword=reword+ch;

        }
        System.out.println(""+reword);
    }
}