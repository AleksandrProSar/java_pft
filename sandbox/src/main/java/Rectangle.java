public class Rectangle {

    public double a;
    public double b;

    public Rectangle(double a, double b) { // создаем конструктор
        this.a = a;
        this.b = b;
    }

    public  double area() {
        return this.a * this.b;
    }
}
