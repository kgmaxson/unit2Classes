import java.util.*;
public class Pseudocode1
{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    String number;
    
    System.out.print("Enter a phone number: ");
    number = s.next();
    
    String numberSub1 = number.substring(0,3);
    String numberSub2 = number.substring(3,6);
    String numberSub3 = number.substring(6,10);
    
    System.out.println("("+numberSub1+")"+numberSub2+"-"+numberSub3);
}
}
