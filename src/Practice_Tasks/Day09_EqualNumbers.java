package Practice_Tasks;

public class Day09_EqualNumbers {
    public static void main(String[] args) {

        /*
        6. Create a class called EqualNumbers, and write a program that can check the equality of the three given numbers
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
         */
        int n1= 3;
        int n2= 8;
        int n3= 8;
        String result= "";

        if (n1==n2 && n2==n3){
           result= "All equal";
        } else if (n1==n2) {
            result= "n1&n2 are equal";
        } else if (n2==n3) {
            result= "n2&n3 are equal";
        } else if (n1==n3) {
            result= "n3&n1 are equal";
        }else{
            result= "None of them are equal";
        }
        System.out.println(result);

    }
}
