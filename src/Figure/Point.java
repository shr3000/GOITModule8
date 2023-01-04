package Figure;

public class Point extends Shape{
    private int x;
    private int y;
    private Enum color;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        color = Color.BLACK;
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

    public void setColor(Enum color) {
        this.color = color;
    }

    @Override
    public boolean isExist() {
        return true;
    }
}
