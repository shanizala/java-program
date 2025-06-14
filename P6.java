import java.util.Scanner;

class P6
{
    public static void main(String [] args)
    {


        System.out.println("Shani zalavadiya ");

        
        int i;
        int j;
        int n;

        Scanner scanner = new Scanner (System.in);


        System.out.print("Enter the number ::");
        n=scanner.nextInt();


        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }



}