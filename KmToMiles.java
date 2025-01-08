import java.util.Scanner;

public class KmToMiles {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilometers :");
        double km = sc.nextDouble();

        double c = km * 0.621371;

        System.out.println("KM TO Miles : " + c);
    }
}
