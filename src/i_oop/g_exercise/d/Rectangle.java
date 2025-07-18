package i_oop.g_exercise.d;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double area = this.length * this.width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (this.length + this.width) * 2;
        return perimeter;
    }
}
