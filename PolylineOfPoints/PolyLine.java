import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    PolyLine(){
        points = new ArrayList<Point>();
    }

    PolyLine(List<Point> points){
        this.points = points;
    }

    //append a point (x,y) to the end of this polyline

    public void appendPoint(int x, int y){
        Point newPoint = new Point(x,y);
        points.add(newPoint);
    }

    //append a point instance to the end of this polyline

    public void appendPoint(Point point){
        points.add(point);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for(Point aPoint : points){
            sb.append(aPoint.toString());
        }
        sb.append("}");
        return sb.toString();
    }

    public double getLength(){
        int nr = 0;
        StringBuilder a = new StringBuilder("{");
        for(Point aPoint : points){
            a.append(aPoint.toString());
            nr++;
        }
        return nr;
    }

}
