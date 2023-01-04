package Figure;

public class Line extends Shape implements Distance{
    private Point a;
    private Point b;
    private Enum color;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
        color = Color.BLACK;
    }

    @Override
    public double length(Point one, Point two) {
        return Math.sqrt(Math.pow((two.getX() - one.getX()), 2) + Math.pow((two.getY() - one.getY()), 2));
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    @Override
    public String figureName() {
        return super.figureName();
    }
    @Override
    boolean isExist() {
        return length(a, b) > 0;
    }


}
