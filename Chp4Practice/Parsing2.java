import java.util.*;
public class Parsing2
{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    String number;
    
    System.out.print("Enter a number between 1000 and 999999: ");
    number = s.next();
    
    int length = number.length();
    
    String numberSub1 = number.substring(length-3,length);
    String numberSub2 = number.substring(0,length-3);
    
    System.out.println(numberSub2+","+numberSub1);
}
}
