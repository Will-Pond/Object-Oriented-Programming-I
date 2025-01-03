class AA {}
class BB extends AA {}

// no problem
class CastingUp {
    public static void test1() {
        BB b = new BB();
        AA a = (AA) b;
    }

    public static void main(String[] args) {

        test1(); //This will print out nothing
    }
}

/**Output
 "C:\Program Files\Eclipse Adoptium\jdk-17.0.4.8-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2\lib\idea_rt.jar=61370:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\wpond\NKU\CSC260\ClassActivity\CH11\CH11\out\production\CH11 CastingUp

 Process finished with exit code 0
 */