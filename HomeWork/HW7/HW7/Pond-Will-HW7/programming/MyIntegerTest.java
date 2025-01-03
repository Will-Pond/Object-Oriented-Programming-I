class MyInteger {
private int value;
MyInteger(int value){
    this.value = value;
}
public int getValue(){
    return value;
}
public boolean isPrime(){
    if(value==2)
        return true;
    for(int i = 2; i*i <=value; i++)
    {
        if(value%i==0)
            return false;
    }
    return true;
}
public boolean isEven() {
    if (value %2 != 0)
        return false;
    else
        return true;
}
public boolean isOdd(){
    if(value % 2 ==0)
        return false;
    else
        return true;
}
static boolean isEven(int n){
    if(n % 2 !=0)
        return false;
    else
        return true;
}
static boolean isOdd(int n){
    if (n % 2 == 0)
        return false;
    else
        return true;
}
static boolean isPrime(int num){
    if(num==2)
        return true;
    for(int i = 2; i*i <=num; i++)
    {
        if(num%i==0)
            return false;
    }
    return true;
}
static boolean isEven(MyInteger n){
    return isEven(n.getValue());
}
static boolean isPrime(MyInteger o){
    return isPrime(o.getValue());
}
static boolean isOdd(MyInteger n){
    return isOdd(n.getValue());
}
static int parseInt(char[] numbers){
    int result = 0;
    for (int i = 0; i < numbers.length; i++){
        result = result * 10 + (numbers[i] - '0');
    }
    return result;
}
static int parseInt(String s){
   int value = Integer.parseInt(s);
   return value;
}
public boolean equals(int anotherNum){
    return value == anotherNum;
}

}


public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}
/** Output
 n1 is even? false
 n1 is prime? true
 15 is prime? false
 3539
 3539
 n2 is odd? false
 45 is odd? true
 n1 is equal to n2? false
 n1 is equal to 5? true
 */