public class Rectangle extends Shape {
    double width;
    double length;

    Rectangle(){}
    Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return "(area= " + getArea() + ",perimeter= " + getPerimeter();
    }
}
