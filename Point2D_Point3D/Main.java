public class Main {
    public static void main(String[] args){
        Point2D p = new Point2D(2,4);
        System.out.println(p.toString());

        Point3D P = new Point3D(9,1,2);
        System.out.println(P.toString());

        P.setXYZ(1,2,3);
        System.out.println(P.getXYZ());
    }
}
