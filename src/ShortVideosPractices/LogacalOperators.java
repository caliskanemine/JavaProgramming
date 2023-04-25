package ShortVideosPractices;

public class LogacalOperators {
    public static void main(String[] args) {

        //logical AND: both or all
        boolean result1= 10>5 && 10>7;
        System.out.println(result1);
        System.out.println("------------------------------");

        boolean result2= 20>15 && 20>25;
        boolean result3= 30>50 && 30>10;
        System.out.println(result2);
        System.out.println(result3);
        System.out.println("-----------------");

        //logical OR:

        boolean result4= 100==200 || 100!=300;
        boolean result5= 1000>900 || 1000<2000;
        boolean result6= 7<0 || 7>15;
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println("--------------------");

        //logical NOT:
        boolean result7= !true;
        boolean result8= !false;
        boolean result9= !(100==200);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);














    }
}
