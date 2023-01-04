package Figure;

public class Parallelogram extends Shape implements Distance, Area{

    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Enum color;

    public Parallelogram(Point a, Point b, Point c, Point d, Enum color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.color = color;
    }

    @Override
    public String figureName() {
        return super.figureName();
    }

    @Override
    boolean isExist() {
        // не повний вираз, треба змінити умови
        return a.getY() == b.getY() && c.getY() == d.getY() && a.getX() != c.getX() && a.getY() != c.getY() &&
                length(a, b) == length(c, d) && length(b, c) == length(a, d);
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    @Override
    public double area() {
        return length(a, b) * length(b, c);
    }

    @Override
    public double length(Point one, Point two) {
        return Math.sqrt(Math.pow((two.getX() - one.getX()), 2) + Math.pow((two.getY() - one.getY()), 2));
    }
}
