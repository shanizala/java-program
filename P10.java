import java.util.Scanner;

class P10
{
    public static void main(String [] args)
    {

        System.out.println("Shani zalavadiya ");

        
        Scanner scanner = new Scanner(System.in);

        int i;
        int [] arr =new int[10];


        for(i=0;i<arr.length;i++)
        {
            System.out.println("Enter the element ::");
            arr[i]=scanner.nextInt();

        }
        for(i=0;i<arr.length;i++)
        {
            System.out.println("element is ::"+arr[i]);
        }
    }
}