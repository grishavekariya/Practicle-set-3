/*Name: Grisha vekariya
Id: 21ce153
Aim: Write a program that illustrates the significance of interface default method.
*/
interface default_method{
    abstract public void abs();
    default void def()
    {
        System.out.println("in default method");
    }
}
class A implements default_method{
    public void abs()
    {
        System.out.println("in abstract method");
    }
    
}
public class Practicle_7 {
    public static void main(String[] args) {
        A a1= new A();
        a1.abs();
        a1.def();
    }   
}
