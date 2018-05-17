public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle(2);

        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        ResizableCircle rc = new ResizableCircle(3);

        System.out.println(rc.getArea());
        System.out.println(rc.getPerimeter());
        System.out.println(rc.resize(3));
    }
}
