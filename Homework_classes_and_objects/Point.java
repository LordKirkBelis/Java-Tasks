package Homework_classes_and_objects;

class Point {
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void print() {
        System.out.println("Координаты x: " + x + ", координаты y: " + y);
    }
}
