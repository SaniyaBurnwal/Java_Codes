 class palindrome
{
    public static void main(String args[])
{
    String word="madam";
    palindrome ob= new palindrome();
        boolean result=ob.isPaalindrome(word);
    System.out.println("The word is palindrome:"+result);
}
boolean isPaalindrome(String w)
{
String reversed="";
    for(int i=w.length()-1;i>=0;i--)
    {
reversed=reversed+w.charAt(i);
    }
    if(reversed.equalsIgnoreCase(w))
return true;
else
return false;
}
}