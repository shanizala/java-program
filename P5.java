import java .util.Scanner;

class P5
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Shani zalavadiya ");
        

        int i;
        int j;
        int n;

        System.out.print("Enter the number ::");
        n=scanner.nextInt();

        for(i=0;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}