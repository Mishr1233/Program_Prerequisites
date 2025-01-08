import java.util.Scanner;

public class Average {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no :");
        double p = sc.nextDouble();

        System.out.println("Enter 2nd no :");
        double r = sc.nextDouble();

        System.out.println("Enter 3rd no :");
        double t = sc.nextDouble();

        double c = (p + t + r) / 3;

        System.out.println("Average of three no is : " + c);
    }
}
