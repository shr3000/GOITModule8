package Figure;

public class Line extends Shape implements Distance{
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double length() {
        return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
    }

    @Override
    public String figureName() {
        return super.figureName();
    }
}
