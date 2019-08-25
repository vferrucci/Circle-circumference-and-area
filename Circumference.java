import java.util.Scanner;
 import javax.swing.JOptionPane;
 //a class to determine circumference and area
  public class Circumference{
  public static void main(String [] args)
  {
  double radius, circumference, area;
  final double PI=3.14159265359;
  radius=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter radius"));

 circumference=2*PI*radius;

 System.out.println("Radius: "+radius+
 " Circumference: " +circumference);

 area=PI*radius*radius;
 JOptionPane.showMessageDialog(null,"The circumference is " +circumference+".\n"+
 "The area is " +area+".");

}//end main
}//end class
