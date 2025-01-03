class A {}
class B extends A {}

// Find which code generates a runtime error, and comment it. 
class CastingDown {
    
    public static void test1() {
        A a = new B();
        B b = (B) a; 
    }

    public static void test2() {
        A a = new A();
        B b = (B) a; // BOOM!
    }
    
    public static void main(String[] args) {
        test1();
        test2();
    }
}

/**Output
 Exception in thread "main" java.lang.ClassCastException: class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
 at CastingDown.test2(CastingDown.java:14)
 at CastingDown.main(CastingDown.java:19)

 */