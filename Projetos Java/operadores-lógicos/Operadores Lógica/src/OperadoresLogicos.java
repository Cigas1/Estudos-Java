/**
 * OperadoresLogicos
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b1 || b2);
        System.out.println(b1 ^ b3);
        System.out.println(b1 ^ b2);
        System.out.println(b1 | b2);
        System.out.println(b1 | b3);
        System.out.println(b1 & b2);
        System.out.println(b1 & b3);
        System.out.println(b1 | b4);
        System.out.println(b1 & b4);
        System.out.println(b1 ^ b4);
        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 20;
        float f1 = 20f;
        float f2 = 10f;
        System.out.println(i1+i2);
        System.out.println(i1-i2);
        System.out.println(i1*i2);
        System.out.println(i1/i2);
        System.out.println(i1%i2);
        System.out.println(f1+f2);
        System.out.println(f1-f2);
        System.out.println(f1*f2);
        System.out.println(f1/f2);
        System.out.println(f1%f2);
        System.out.println(i1==i2);
        System.out.println(i1!=i2);
        System.out.println(i1>i2);
        System.out.println(i1<i2);
        System.out.println(i1>=i2);
        System.out.println(i1<=i2);
        System.out.println(i1==f1);
        System.out.println(i1!=f1);
        System.out.println(i1>f1);
        System.out.println(i1<f1);
        System.out.println(i1>=f1);
        System.out.println(i1<=f1);
        System.out.println(f1==i1);
        System.out.println(f1!=i1);
        System.out.println( ^(i1+i2) = (f1+f2));
    }
}