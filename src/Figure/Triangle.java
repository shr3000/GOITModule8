package Figure;

public class Triangle extends Shape implements Area, Distance{
    private Point a;
    private Point b;
    private Point c;
    private Enum color;
    public Triangle(Point a, Point b, Point c, Color color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String figureName() {
        return super.figureName();
    }

    @Override
    boolean isExist() {
        return length(a, b) + length(b, c) > length(a, c);
    }

    @Override
    public double length(Point one, Point two) {
        return Math.sqrt(Math.pow((two.getX() - one.getX()), 2) + Math.pow((two.getY() - one.getY()), 2));
    }
}
