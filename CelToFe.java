import java.util.*;
public class CelToFe{
public static void main(String args[]){

Scanner sc=new Scanner (System.in);
System.out.println("Enter temperature in Celsius:");
double a=sc.nextDouble();


double c=(a * 9/5) + 32;

System.out.println("temperature in Fahrenheit : "+c);
}

}