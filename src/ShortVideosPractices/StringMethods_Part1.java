package ShortVideosPractices;

public class StringMethods_Part1 {
    public static void main(String[] args) {

        // charAt(int index): returns the char at given index, return type----> char
        String str= "Cydeo";
        //index:     01234
       char ch1= str.charAt(2);
        System.out.println(ch1);
        System.out.println("--------------------");

        //length(): returns the total number of characters. return type ---> int
        String str2= "Wooden Spoon";
        int n1= str2.length();
        System.out.println(n1);
        int lastIndex= str2.length()-1;
        System.out.println(lastIndex);
        System.out.println("----------------");


        //toLowerCase: returns the all lower case version of the String. return type----> String
        String str3= "Java";
        str3 = str3.toLowerCase(); //"java"
        System.out.println(str3);
        System.out.println("---------------------");

        //toUpperCase(): returns the all upper case version of the String. return type----> String
        String str4= "Java";
        str4= str4.toUpperCase(); //"JAVA"
        System.out.println(str4);
        System.out.println("---------------");

        //trim(): returns the String without all the white spaces(unused spaces). return type---> String
        String str5= "Python         Java Programming    Language     ";
        str5= str5.trim();
        System.out.println(str5);
        System.out.println("---------------------");

        //indexOf(): returns the first matching character' index number return type----> int
        String str6= "Wooden Spoon";
        int indexNumOfFirstO= str6.indexOf("o");
        System.out.println(indexNumOfFirstO);
        int indexNumOfSecondO= str6.indexOf("od");
        System.out.println(indexNumOfSecondO);
        int indexNumOfThirdO= str6.indexOf("po") +1; //p nin index numberını yazacapı için +1 ekleriz
        System.out.println(indexNumOfThirdO);
        System.out.println("--------------");

        //lastIndexOf(): return the last matching character index number
        String str7= "Wooden Spoon";
        int indexNumOfLastO = str7.lastIndexOf("o");
        System.out.println(indexNumOfLastO);






    }
}
