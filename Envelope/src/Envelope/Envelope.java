package Envelope;

public class Envelope {

        private double width;
        private double height;

    public Envelope() {
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width)throws Exception {
        if(width<=0) throw new Exception("You should enter side more then 0");
        this.width = width;
    }

    public void setHeight(double height)throws Exception {
        if(height<=0) throw new Exception("You should enter side more then 0");
        this.height = height;
    }
}
