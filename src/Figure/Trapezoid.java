package Figure;

public class Trapezoid extends Shape implements Area, Distance{
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Enum color;

    public Trapezoid(Point a, Point b, Point c, Point d, Enum color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.color = color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    @Override
    boolean isExist() {
        return true;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double length(Point one, Point two) {
        return 0;
    }

    @Override
    public String figureName() {
        return super.figureName();
    }
}
