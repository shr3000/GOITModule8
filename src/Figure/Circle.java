package Figure;

public class Circle extends Shape{
    private double radius;
    private Point center;
    private Enum color;

    public Circle(double radius, Point center, Enum color) {
        this.radius = radius;
        this.center = center;
        this.color = color;
    }
    @Override
    public String figureName() {
        return super.figureName();
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    @Override
    boolean isExist() {
        return radius > 0;
    }
}
