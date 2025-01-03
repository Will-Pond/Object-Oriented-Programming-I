
public class DataTypes {

    public static void testPrimitiveTypes() {
        int x = 10;
        System.out.println("1: " + (x == Integer.MAX_VALUE));
        

        x = Integer.MIN_VALUE; // What is the value of Integer.MIN_VALUE?
        // You can execute this command to get an answer and fill in the ????? -> System.out.println(x);
        System.out.println("2: " + (x == Integer.MIN_VALUE));

        long x2 = 1234567890123L;
        System.out.println("3: " + (x2 == Integer.MAX_VALUE));

        double y = 10.1;
        System.out.println("4: " + (y == 10.1)); // This returns true, but dangerous, think why?

        float y2 = 123232.1234567890123456F; // Don't forget the F for float type data
        System.out.println("5: " + (y2 == 123232.1234F)); // This returns, true, but You see why it is dangerous
        
        boolean z = true;
        System.out.println("6: " + (z == true));
    }

    public static void testCasting() {
        int x = 10;
        int y = 20;
        System.out.println("7: " + (0.5 != x / y));
        System.out.println("8: " + (0.5 == (double) x / y));
    }


    public static void main(String[] args) {
        testPrimitiveTypes();
        testCasting();
    }
}

/** Copy your output here - You should have 6 trues
 *
 1: false
 2: true
 3: false
 4: true
 5: true
 6: true
 7: true
 8: true

 Process finished with exit code 0

 */
