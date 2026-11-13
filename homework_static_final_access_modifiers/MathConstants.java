package homework_static_final_access_modifiers;

public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

    static double calculateCircleArea(double r)  {
        return PI * r * r;
    }
    static double calculateCircumference(double r) {
        return 2  * PI * r;
    }
    static double calculateExponentialGrowth(double initialValue, double rate, double time)  {
        return initialValue * Math.pow(E, rate * time);
    }

    public static void main(String[] args) {
        System.out.println(MathConstants.calculateCircleArea(10));
        System.out.println(MathConstants.calculateCircumference(15));
        System.out.println(MathConstants.calculateExponentialGrowth(10,15,10));
    }
}
