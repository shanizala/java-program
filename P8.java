import java.util.Scanner;

class P8
{
    public static void main(String [] args)
    {

        System.out.println("Shani zalavadiya ");

        
        Scanner scanner = new Scanner(System.in);


        int i;
        int j;
        int n;


        System.out.print("Enter the number ::");
        n=scanner.nextInt();


        for(i=n;i>0;i--)
        {
            for(j=i;j>0;j--)
            {
                System.out.print(i);

            }
            System.out.println("");
        }
    }
}