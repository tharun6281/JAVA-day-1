import java.util.Scanner;
public class average
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter maths marks:");
        int a=sc.nextInt();
        System.out.println("Enter java marks:");
        int b=sc.nextInt();
        System.out.println("Enter python marks:");
        int c=sc.nextInt();
        int sum=a+b+c;
        double avg=sum/3;
        System.out.println("the sum of marks:"+sum);
        System.out.println("the average marks:"+avg);
    }
}
