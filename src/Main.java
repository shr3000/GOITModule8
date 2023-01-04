import Figure.Color;
import Figure.Point;
import Figure.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Point(1, 2).figureName());
        System.out.println(new Rectangle(new Point(1, 2), new Point(3, 2), new Point(3, 4),
                new Point(4, 4), Color.RED).figureName());
    }
}