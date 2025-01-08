
import java.util.*;

public class VolumeCircle {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius :");
        double a = sc.nextDouble();

        System.out.println("Enter height :");
        double b = sc.nextDouble();
        double c = 3.14 * a * a * b;

        System.out.println("Volume of Circle is : " + c);
    }

}