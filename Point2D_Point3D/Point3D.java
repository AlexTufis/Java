public class Point3D extends Point2D {
    float z = 0.0f;

    Point3D(float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    Point3D(){}

    public float getZ(){
        return this.z;
    }

    public void setZ(float z){
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] points = new float[3];
        points[0] = this.getX();
        points[1] = this.getY();
        points[2] = this.z;
        return points;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + getZ() + ")";
    }
}
