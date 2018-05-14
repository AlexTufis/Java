public class MyCircle {
    private MyPoint center;
    int radius = 1;

    MyCircle(){
        center = new MyPoint();
        this.radius = radius;
    }
    MyCircle(int x,int y,int radius){
        center = new MyPoint(x,y);
        this.radius = radius;
    }
    MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public MyPoint getCenter(){
        return this.center;
    }

    public void setCenter(MyPoint center){
        this.center = center;
    }

    public int getCenterX(){
        return this.center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterY(){
        return this.center.getY();
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY(){
        return center.getXY();
    }

    public void setCenterXY(int x,int y){
        center.setXY(x,y);
    }

    @Override
    public String toString() {
        return "MyCircle[radius = " + this.radius + ",center = " + center + "]";
    }

    public double getArea(){
        return Math.PI*(radius*radius);
    }

    public double getCircumference(){
        return 2.0 * Math.PI * radius;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
