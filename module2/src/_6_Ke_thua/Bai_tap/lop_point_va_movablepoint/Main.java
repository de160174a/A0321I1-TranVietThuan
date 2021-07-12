package _6_Ke_thua.Bai_tap.lop_point_va_movablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println(point);
        Point moveblePoint = new MoveblePoint(4, 5, 3, 3);
        ((MoveblePoint) moveblePoint).move();
        System.out.println(moveblePoint);
    }
}