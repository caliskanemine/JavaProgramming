package ShortVideosPractices;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'A'; i <='E'; i++) {
            System.out.println(i);

            if (i=='C'){
                break;
            }
        }
        System.out.println("-------------------");

        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i);
            if (i== 3){
                break;
            }
        }

        System.out.println("--------------------");


        // Continue Statement

        for (char i = 'A'; i <='E'; i++) {

            if (i == 'C') {
                continue;
            }
            System.out.println(i);

        }










    }
}
