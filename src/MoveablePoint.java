public class MoveablePoint extends Point{
    public float xSpeed = 0;
    public float ySpeed = 0;
    public MoveablePoint(){

    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] temp = new float[2];
        temp[0] = this.xSpeed;
        temp[1] = this.ySpeed;
        return temp;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "PointMoveable: x = " + this.x + ", y = " + this.y+", speed = ("+this.xSpeed+","+this.ySpeed+")";
    }

    public MoveablePoint move(){
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }
}
