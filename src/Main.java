public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point.setXY(4,5);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint.setSpeed(4,6);
        System.out.println(moveablePoint);

        moveablePoint.setXY(3,4);
        System.out.println(moveablePoint);

        moveablePoint = moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
