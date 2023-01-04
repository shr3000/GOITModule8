package Figure;

public class Quad extends Shape implements Area, Distance{
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Enum color;

    public Quad(Point a, Point b, Point c, Point d, Enum color) {
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

        return a.getX()==b.getX() && c.getX() == d.getX() && a.getY() == b.getY() && c.getY() == d.getY() &&
                a.getX() != c.getX() && a.getY() != c.getY() && length(a, b) == length(a, c);
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