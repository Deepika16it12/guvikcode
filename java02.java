import java.util.Scanner;
 class oddOReven
{
    public static void main(String[] args) 
    {
        int num;
        Scanner input=new Scanner(System.in);
         num=input.nextInt();
        
        if(num > 0)
        {
            if(num%2==0)
            {
                System.out.println("Even");
            }
            else
            {

                System.out.println("Odd");
            }
        }
        else{
            System.out.println("invalid input");
        }
    }
}
