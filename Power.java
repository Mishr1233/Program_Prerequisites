import java.util.*;

public class Power {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base :");
        double l = sc.nextDouble();

        System.out.println("Enter exponent :");
        double b = sc.nextDouble();

        double c = Math.pow(l, b);

        System.out.println("Power is : " + c);
    }

}
