public class CalcNum
{
  public static void main (String [] args)
    {
        int large=0; 
        int num;

        System.out.println("enter the number");

        Scanner input=new Scanner(System.in);

        int n=input.nextInt();

        for(int i=0;i<n;i++)
        {
          num=input.nextInt();
          if(num>large)
          {
           large=num;
          }
          System.out.println("the largest is:"+large);
          //gives the largest number in n numbers
