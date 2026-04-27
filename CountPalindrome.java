/* WAP to define a method countPalindrome([]) which takes an array and 
*  count all palindroim number preset in it and returns it.
 * 
*/
import java.util.Scanner;

class CountPalindrome{

    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
         int size=6;
         int[]  ar=new int[size];
        System.out.println("Enter the numbers in array::");
        for(int i=0;  i<size;i++ ){
            ar[i]=sc.nextInt();
        }
        CountPalindrome obj=new CountPalindrome();
        int result=obj.countPalindrome(ar);
        System.out.println("total palindrome number is"+result);
    }
       
        int countPalindrome(int ar[]){
           int count=0;
           for(int i=0;i<ar.length;i++)
           {
           int num=ar[i];
           int rev=0;
           int temp=num;
           while(temp>0)
           {
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
           }
           if(rev==num)
           {
            count++;
           }
        }
return count;
}
}