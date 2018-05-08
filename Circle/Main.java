public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle(); //primul constructor

        System.out.println("The circle has radius of " + c1.getRadius() + " and circumference of " + c1.getCircumference());

        Circle c2 = new Circle(2.0); //al 2 lea constructor

        System.out.println("The circle has radius of " + c2.getRadius() + " and circumference of " + c2.getCircumference());
    }
}
