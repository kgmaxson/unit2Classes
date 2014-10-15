import java.util.Scanner;
public class Rectangle
{
    public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       
       double width,length,area,perimeter,diagonal;
       
       System.out.print ("Enter width: ");
       width = s.nextDouble();
       
       System.out.print ("Enter length: ");
       length = s.nextDouble();
       
       area = width*length;
       perimeter = 2*width+2*length;
       diagonal = Math.pow(Math.pow(width,2)+Math.pow(length,2),.5);
       diagonal = Math.round(diagonal*100.0)/100.0;
       
       System.out.println("Area: "+area);
       System.out.println("Perimeter: "+perimeter);
       System.out.println("Diagonal: "+diagonal);
   }
}