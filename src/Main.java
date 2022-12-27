import Figure.Point;
import Figure.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Point(1, 2, "Green").figureName());
        System.out.println(new Rectangle().figureName());
    }
}