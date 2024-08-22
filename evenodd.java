import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter an Integer to check whether it is even or odd");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num +"is even Integer");
        }
        else
        {
            System.out.println(num +"is odd Integer");
        }
    }
}
