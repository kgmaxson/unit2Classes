import java.util.*;
public class Pseudocode2
{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    double due,recieved;
    int difference,dollars,quarters,dimes,nickels,pennies;
    
    System.out.print("Enter amount due: ");
    due = s.nextDouble();
    int dueCents = (int)(due*100);
    
    System.out.print("Enter amount recieved: ");
    recieved = s.nextDouble();
    int recievedCents = (int)(recieved*100);
    
    difference = (recievedCents-dueCents);
    
    dollars = difference/100;
    quarters = (difference-dollars*100)/25;
    dimes = (difference-dollars*100-quarters*25)/10;
    nickels = (difference-dollars*100-quarters*25-dimes*10)/5;
    pennies = difference-dollars*100-quarters*25-dimes*10-nickels*5;
    
    System.out.println("Dollars: "+dollars);
    System.out.println("Quarters: "+quarters);
    System.out.println("Dimes: "+dimes);
    System.out.println("Nickels: "+nickels);
    System.out.println("Pennies: "+pennies);
}
}
