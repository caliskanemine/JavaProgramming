package ShortVideosPractices;

public class UnaryOperators {
    public static void main(String[] args) {

        //positive & negative
        int a= -100;
        int b= +200;

        boolean aIsNegative= a<0;
        boolean bIsPositive= b>0;

        System.out.println(aIsNegative);
        System.out.println(bIsPositive);


        //Increment & Decrement

        int x= 18;
        System.out.println(++x);
        System.out.println(--x);

        int z= 20;
        System.out.println(z++);
        System.out.println(z);
        System.out.println(z++);
        System.out.println(z);

        int q= 100;
        System.out.println(q--);
        System.out.println(q++);



    }
}
