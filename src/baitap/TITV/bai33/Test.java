package baitap.TITV.bai33;

public class Test {
    public static void main(String[] args) {
        vd md1 = new vd(15,5,2025);
        vd md2 = new vd(11,1,2021);
        vd md3 = new vd(15,5,2025);
//
//        System.out.println(md1.toString());// hasdcode
//        System.out.println(md2.toString());// hasdcode
//        System.out.println(md3.toString());// hasdcode

        int a=5;
        int b =6;
        if (a==b) System.out.println("a=b");
        else System.out.println("a != b");



        if (md1==md3)
            System.out.println("md1 == md3");
        else
            System.out.println("md1 != md3");

        System.out.println("md1 so sanh bang md2" + md1.equals(md2));
        System.out.println("md1 so sanh bang md3" + md1.equals(md3));
        System.out.println(md1.hashCode());
        System.out.println(md2.hashCode());
        System.out.println(md3.hashCode());

    }
}
