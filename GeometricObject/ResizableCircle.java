public class ResizableCircle extends Circle implements Resizable{
    ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percent) {
        super.radius += percent;
        return super.radius;
    }
}
