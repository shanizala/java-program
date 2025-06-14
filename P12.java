import java.util.Scanner;

class P12
{
    public static void main(String [] args)
    {

        System.out.println("Shani zalavadiya "); 

        
        Scanner scanner = new Scanner (System.in);

        int size;

        System.out.println("Enter the Array size ::");
        size=scanner.nextInt();

        int [] n=new int [size];

        System.out.println("Enter the Arraay element ");

        for(int i=0;i<n.length;i++)
        {
            System.out.print("Enter element ::");
            n[i]=scanner.nextInt();
        }

        int sum=0;

        for(int i=0;i<n.length;i++)
        {
            sum= sum+n[i];
        }

        System.out.println("Array elements  ");

        for(int i=0;i<n.length;i++)
        {
            System.out.println("element is ::"+n[i]);
        }

        System.out.println("Sum of all Array element is ::"+sum);
    }
}