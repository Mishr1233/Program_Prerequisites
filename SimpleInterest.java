import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal :");
        double p = sc.nextDouble();

        System.out.println("Enter Rate :");
        double r = sc.nextDouble();

        System.out.println("Enter time :");
        double t = sc.nextDouble();

        double c = (p * t * r) / 100;

        System.out.println("Simple Interest is : " + c);
    }
}
