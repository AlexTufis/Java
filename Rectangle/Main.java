public class Main {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(); //first constructor

        System.out.println("The rectangle has length " + r1.getLength() + " and width " + r1.getWidth() + " and area " + r1.getArea() + " and perimeter " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(4,2);//second constructor

        System.out.println("The rectangle has area " + r2.getArea() + " and perimeter " + r2.getPerimeter());
    }
}
