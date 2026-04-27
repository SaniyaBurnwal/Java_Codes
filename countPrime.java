import java.util.Scanner;

class countPrime{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        countPrime ob=new countPrime();
        int size=6;
        int[] ar=new int[size];
        System.out.println("Enter the numbers in array::");
        for(int i=0;  i<size;i++ ){
            ar[i]=sc.nextInt();
        }

        int res=ob.findMaxPrime(ar);
        System.out.println("maximum prime number is"+res);
    }

    int findMaxPrime(int[] ar)
    {
        int max=-1;
        for(int i=0; i<ar.length; i++)
        {
              if(checkForPrime(ar[i]) && ar[i]>max)
              max=ar[i];
        }
       return max;
    } 
    boolean checkForPrime(int n)
    {
       if(n<=1)
       return false;
       for(int i=2;i<=n/2;i++)
       {
       if(n%i==0)
       return false;
    }
    return true;   
    }
}