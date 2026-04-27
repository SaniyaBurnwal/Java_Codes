public class methods
{
    public static void main(String[] args) {
        methods ob = new methods();
        ob.addition(12,23);
        ob.subtraction(30,20);
        ob.multi(5,6);
        ob.division(25,5);
    }
        public void addition(int a,int b)
        {
            int c=a+b;
            System.out.println("sum is "+c);
        }
        public void subtraction(int a,int b)
        {
            int c=a-b;
            System.out.println("difference is "+c);
        }
        public void multi(int a,int b)
        {
            int c=a*b;
            System.out.println("product is "+c);
        }
        public void division(int a,int b)
        {
            int c=a/b;
            System.out.println("quotient is "+c);
        }
    }