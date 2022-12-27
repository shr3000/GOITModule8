package Figure;

public class Point extends Shape{
    private int x;
    private int y;
    private String color;
    public Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String figureName() {

        return super.figureName();
    }
}
