import java.util.Scanner;
public class interest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest (% per year): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        // Formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
        sc.close();
    }
}