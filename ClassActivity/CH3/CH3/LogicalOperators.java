public class LogicalOperators {
    public static void andTest() {
        System.out.println("1.1 " + ((true && true) == ));
        System.out.println("1.2 " + ((true && false) == ));
        System.out.println("1.3 " + ((false && true) == ));
        System.out.println("1.4 " + ((false && false) == ));
    }
    
    public static void orTest() {
        System.out.println("2.1 " + ((true || true) == ));
        System.out.println("2.2 " + ((true || false) == ));
        System.out.println("2.3 " + ((false || true) == ));
        System.out.println("2.4 " + ((false || false) == ));
    }
    
    public static void notTest() {
        System.out.println("3.1 " + ((!true) == ));
        System.out.println("3.2 " + ((!false) == ));
    }
    
    public static void xorTest() {
        System.out.println("4.1 " + ((true ^ true) == ));
        System.out.println("4.2 " + ((true ^ false) == ));
        System.out.println("4.3 " + ((false ^ true) == ));
        System.out.println("4.4 " + ((false ^ false) == ));
    }
    
    public static void main(String[] args) {
        andTest();
        orTest();
        notTest();
        xorTest();
    }
}

/* Output:

*/