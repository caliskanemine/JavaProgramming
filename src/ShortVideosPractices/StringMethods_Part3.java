package ShortVideosPractices;

public class StringMethods_Part3 {
    public static void main(String[] args) {

        //isEmpty(): checks if the string' length is zero. return type----> boolean
        String str= "   ";
        boolean r1= str.isEmpty();
        System.out.println(r1);
        System.out.println("-----------------------");

        //isBlank(): checks if the string is blank. return type -----> boolean
        String str2= "    ";
        boolean r2=str2.isBlank();
        System.out.println(r2);
        System.out.println("------------------");

        //equals(String): compares the content of the two Strings. return type----> boolean
        String s1= "Java";
        String s2= new String("Java");
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2));
        System.out.println("------------------");

        //equalsignorecase(String): compares the content of the two String irrespective of the case sensitivity. return type---> boolean
        String word1= "JAVA";
        String word2= "java";
        System.out.println(word1.equals(word2)); //false
        System.out.println(word1.equalsIgnoreCase(word2)); //true
        System.out.println("--------------------");

        //contains(String): checks if the given String is contained in the String. type---> boolean
        String sentence= "I love Java programming language";
        boolean hasCSharp= sentence.contains("C#");
        System.out.println("hasCSharp = " + hasCSharp);
        boolean hasJava= sentence.contains("Java");
        System.out.println("hasJava = " + hasJava);
        System.out.println("--------------------");

        //startsWith(String): checks if the string started with the given character(s). return type---->boolean
        String name= "Wooden Spoon";
        boolean result1= name.startsWith("Wood");
        System.out.println("result1 = " + result1);
        boolean result2= name.startsWith("Spoon");
        System.out.println("result2 = " + result2);
        System.out.println("---------------------");

        //endsWith(String)= checks if the string ends with the given character(s). return type-----> boolean
        boolean result3= name.endsWith("Spoon");
        System.out.println("result3 = " + result3);
        boolean result4= name.endsWith("Wooden Spoon");
        System.out.println("result4 = " + result4);















    }
}
