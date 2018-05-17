public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    Point2D(){ }

    public float getX(){
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY(){
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] results = new float[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
