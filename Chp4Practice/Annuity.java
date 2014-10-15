import java.util.Scanner;
public class Annuity
{
    private static double interest = .08;
    private static double numberOfPayments = 20;
    private static double periodicPayment = 10000;
    private static double presentValue = 0;
    public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       
       System.out.print ("Enter interest: ");
       interest = s.nextDouble();
       
       System.out.print ("Enter Number of Payments: ");
       numberOfPayments = s.nextDouble();
       
       System.out.print ("Enter Periodic Payment: ");
       periodicPayment = s.nextDouble();
       
       System.out.print ("Enter Present Value: ");
       presentValue = s.nextDouble();
       
       double in = Math.pow(1+interest,numberOfPayments-1);
       presentValue += periodicPayment*(((in-1)/interest)/(in)+1);
       
       System.out.println(Math.round(presentValue*100.0)/100.0);
   }
}