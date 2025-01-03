public class LeapYear {

    public static String isLeapYear(int year) {
        return  ? "leap year" : "not leap year";
    }
    public static void main(String[] args) {
        System.out.println("1: " + isLeapYear(2004).equals("leap year"));
        System.out.println("2: " + isLeapYear(2000).equals("leap year"));
        System.out.println("3: " + isLeapYear(2100).equals("not leap year"));
        System.out.println("4: " + isLeapYear(2001).equals("not leap year"));
        System.out.println("5: " + isLeapYear(2004).equals("leap year"));
    }
}
/* Output:

*/