public class Square extends Rectangle {
    Square(){}
    Square(double side){
        super(side,side);
    }
    Square(double side,String color,boolean filled){
        super(side,side);
        this.color = color;
        this.filled = filled;

    }

    public double getSide(){
       return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "side= " + getSide();
    }
}
