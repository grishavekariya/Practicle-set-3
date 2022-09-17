/*Name: Grisha vekariya
Id: 21ce153
Aim: WAP that illustrate the interface inheritance. Interface P is extended by P1 and P2 interfaces.
1,2 Interface P12 extends both P1 and P2.
Each interface declares one method and one constant. Create one class that implements P12. By using the object of the
class invokes each of its method and displays constant.
*/

interface p
{
  final int i=5;
  void  display();
 }
 
  interface p1 extends p
  {
   final int i1=10;
   void displayp1();
  }
 
  interface p2 extends p
  {
   final int i2=15;
   void displayp2();
  }
 
  interface p12 extends p1,p2
  {
  final int i3=20;
   void displayp12();
  }
  class Q implements p12
   {
     public void display()
     {
       System.out.println("display p:" +i);
     }
     public void displayp1()
     {
       System.out.println("display p1:" +i1);
     }
     public void displayp2()
     {
       System.out.println("display p2:" +i2);
     }
     public void displayp12()
     {
       System.out.println("display p12:" +i3);
     }
    }
   
  public class InterfacePr_3
  {
    public static void main(String [] args)
    {
      Q obj =new Q();
      obj.display();
      obj.displayp1();
      obj.displayp2();
      obj.displayp12();
     }
    }  

