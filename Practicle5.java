/*Name: Grisha vekariya
Id: 21ce153
Aim:Write a java program which shows importing of classes from other user define packages.
*/
import MyPackage.Myclass;

public class Practicle5
{
	public static void main(String[] args) 
	{
		Myclass m1= new Myclass();
		System.out.println("SUM : "+m1.sum(5, 10));
		System.out.println("DIFFERENCE :"+m1.diff(20, 10) );
		
		System.out.println();
    }
} 