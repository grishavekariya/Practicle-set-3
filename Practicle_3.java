/*Name: Grisha vekariya
Id: 21ce153
Aim: Develop a Program that illustrate method overriding concept.
*/

class A{
    public int num(int a)
    {
        return 2*a;
    }
}
class B extends A{
    public int num(int a)
    {
        return a+5;
    }
}
public class Practicle_3 {
    public static void main(String[] args) {
        A a= new A();
        A b =new B();
        System.out.println( a.num(5));
        System.out.println(b.num(3));
    }
}


