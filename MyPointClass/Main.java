public class Main {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint();  // Test constructor
        System.out.println(p1);      // Test toString()
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());

        //MyCircle class

        MyCircle c1 = new MyCircle();
        System.out.println(c1);
        c1.setCenterX(3);
        c1.setCenterY(5);
        System.out.println(c1);
        c1.setCenterXY(2,6);
        System.out.println(c1);
        System.out.println(c1.getArea());


        //MyTriangle class

        MyTriangle t1 = new MyTriangle();
        System.out.println(t1);
        MyTriangle t2 = new MyTriangle(1,1,1,1,5,6);
        System.out.println(t2);
        System.out.println(t2.getPermiter());
        System.out.println(t2.getType());

    }
}
