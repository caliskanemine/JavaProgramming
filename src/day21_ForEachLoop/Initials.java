package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names= {"nfjdsf dbfs", "jdhf djf", "jdfgf hdg", "jfhdf hdhg", "jgfhsdf gdg", "erkejfdh jfgh", "kjdsjh fjdgh"};

        for (String each: names) {
            String initial= each.charAt(0)+"."+ each.charAt(each.indexOf(" ") +1 );
            System.out.println(initial);
        }








    }
}
