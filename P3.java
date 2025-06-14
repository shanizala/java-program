import java.util.Scanner;

class P3
{
    public static void main(String [] args)
    {

        System.out.println("Shani zalavadiya ");

        
        Scanner scanner = new Scanner(System.in);
        int i;
        int n;
        int f;

    System.out.println("Enter the number for print ::");
    n=scanner.nextInt();    

        for (i=0;i<=n;i++)
        {
            System.out.println(i);
        }
        System.out.println("Enter the search number  ::");
        f=scanner.nextInt();

        for(i=0;i<=n;i++)
        {
            if(f==i)
            {
                System.out.print("number "+i+" is exited ");
            }
           
        }
    }
}