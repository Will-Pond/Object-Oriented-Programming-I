public class ReferenceCopy {

    public static void main(String[] args) {
        Circle1 c2_1 = new Circle1(10.0);
        Circle1 c2_2 = new Circle1(20.0);

        // they reference different objects
        System.out.println("1.1: " + (c2_1.radius == 10.0));
        System.out.println("1.2: " + (c2_2.radius == 20.0));
        
        // they reference the same objects
        c2_2 = c2_1;
        System.out.println("1.3: " + (c2_2.radius == 10.0));
        System.out.println("1.4: " + (c2_2.radius == c2_1.radius));
    }
}

/**
 * output
 1.1: true
 1.2: true
 1.3: true
 1.4: true
 */