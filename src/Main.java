import java.awt.*;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int x = 1;
//        int y = x;
//        x = 2;
//        System.out.println("X: " + x);
//        System.out.println("Y: " + y);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println(point1);
        System.out.println(point2);
    }
}