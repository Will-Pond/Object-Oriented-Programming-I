class Test {
    public void hello() {}
}

class Test2 {
    Test t; // Why is this an error?//
}

public class NullPointerException {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.t.hello(); // we expect a runtime exception. NullPointError
    }
}

/**
 * output
 Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Test.hello()" because "test2.t" is null
 at NullPointerException.main(NullPointerException.java:13)
 */