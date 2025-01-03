import java.util.Date;
import java.util.Random;

public class JavaUtilities {
    public static void dateTest() {
        java.util.Date date = new Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " +
                date.getTime() + " milliseconds"); 
        System.out.println(date.toString());
    }
    
    public static void randomTest() {
        Random random1 = new Random(3);
        System.out.print("From random1: "); 
        for (int i = 0; i < 10; i++)
            System.out.print(random1.nextInt(1000) + " ");
        Random random2 = new Random(35);
        System.out.print("\nFrom random2: "); 
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
    }
    
    public static void main(String[] args) {
        dateTest();
        randomTest();
    }
}

/**
 * output
 The elapsed time since Jan 1, 1970 is 1668741758187 milliseconds
 Thu Nov 17 22:22:38 EST 2022
 From random1: 734 660 210 581 128 202 549 564 459 961
 From random2: 752 43 166 175 852 271 257 594 996 840
 */
