package Figure;

public class Point {
    private int x;
    private int y;

    private String color;
    private String name = "Point";

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
}
