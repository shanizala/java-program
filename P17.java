import java.util.Scanner;

class P17
{
    public static void main(String [] args)
    {

        System.out.println("Shani zalavadiya ");

        
        Scanner sc = new Scanner (System.in);

        int [][] n={{1,3},{4,5}};

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Array element is ::"+n[i][j]);
            }
        }
    }
}