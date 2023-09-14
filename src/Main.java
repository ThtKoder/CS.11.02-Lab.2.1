public class Main {

    public static void main(String[] args) {
    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    // 2. add
    public static int addTwo(int a, int b, int c, int d){
        return add(a,b,c,d);
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String quote){
        return quote + quote + quote;
    }

    // 6. half
    public static double half(double input){
        return input / 2 ;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double input){
        return (int) Math.round(input);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double input){
        double returnValue = input -.5; //this works because when it is cast to an int, java leaves out the decimal
        return (int) (returnValue);     //entirely so that it is only the first integer included (can think of this as manual rounding).
    }
}
