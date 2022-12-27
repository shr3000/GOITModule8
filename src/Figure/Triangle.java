package Figure;

public class Triangle extends Shape implements Area{
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {

        return 0;
    }

    @Override
    public String figureName() {
        return super.figureName();
    }
}
