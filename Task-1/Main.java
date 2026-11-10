class MathOperations {
    int add(int x, int y) {
        return x + y;
    }
    int subtract(int x, int y) {
        return x - y;
    }
    int multiply(int x, int y) {
        return x * y;
    }
    double divide(int x, int y) {
    return (double) x / y;
    }
    int findMax(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    int difference(int x, int y) {
        return Math.abs(x - y);
    }
    int squareArea(int side) {
        return side * side;
    }
    int squarePerimeter(int side) {
        return side * 4;
    }
    double convertSecondsToMinutes(int second) {
        return (double) second / 60;
    }
    double averageSpeed(double distance, double time) {
        return (double) distance / time;
    }
    double findHypotenuse(double a, double b) {
        return (double) Math.sqrt(a * a + b * b);
    }
    double cirleCircumFerence(double radius) {
        return (double) 2 * Math.PI * radius;
    }
    double calculatePercentage(double total, double part) {
        return (double) (part / total) * 100;
    }
    double celsiusToFahrenheit(double c) {
        return (double) c * 9 / 5 + 32;
    }
    double fahrenheitToCelsius(double f) {
        return (double) (f - 32) * 5 / 9;
    }
    public static void main (String[] args) {
        MathOperations ops = new MathOperations();
        int result1 = ops.add(1,2);
        System.out.println(result1);
        int result2 = ops.subtract(3,2);
        System.out.println(result2);
        int result3 = ops.multiply(5,6);
        System.out.println(result3);
        double result4 = ops.divide(1,2);
        System.out.println(result4);
        int result5 = ops.findMax(5,10);
        System.out.println(result5);
        int result6 = ops.difference(5,3);
        System.out.println(result6);
        int result7 = ops.squareArea(2);
        System.out.println(result7);
        int result8 = ops.squarePerimeter(10);
        System.out.println(result8);
        double result9 = ops.convertSecondsToMinutes(20);
        System.out.println(result9);
        double result10 = ops.averageSpeed(20,5);
        System.out.println(result10);
        double result11 = ops.findHypotenuse(2,4);
        System.out.println(result11);
        double result12 = ops.cirleCircumFerence(5);
        System.out.println(result12);
        double result13 = ops.calculatePercentage(20,5);
        System.out.println(result13 + "%");
        double result14 = ops.celsiusToFahrenheit(5);
        System.out.println(result14);
        double result15 = ops.fahrenheitToCelsius(20);
        System.out.println(result15);
    }
}
