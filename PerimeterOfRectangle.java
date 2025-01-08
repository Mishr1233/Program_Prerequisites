import java.util.Scanner;

public class PerimeterOfRectangle {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length :");
        double l = sc.nextDouble();

        System.out.println("Enter width :");
        double b = sc.nextDouble();

        double c = 2 * (l + b);

        System.out.println("Rectanglr of perimeter is : " + c);
    }
}
