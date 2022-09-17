/*Name: Grisha vekariya
Id: 21ce153
Aim: Write a program that demonstrates use of packages & import statements.
*/
import java.util.Scanner;

import java.lang.Math;

public class Practicle_6 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println("POWER: "+ Math.pow(a, b));
        System.out.println("ABSOLUTE :" +Math.abs(c));
    }
}


