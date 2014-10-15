import java.util.*;
public class Parsing
{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    String number;
    
    System.out.print("Enter a number between 1,000 and 999,999: ");
    number = s.next();
    
    number = number.replace(",","");
    
    System.out.println(number);
}
}
