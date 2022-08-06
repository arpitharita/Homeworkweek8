package homeworkweek_8;

public class Rectangle {

    double width;
    double length;

    public Rectangle(double width, double length){
        if (width < 0){
            width = 0;
            this.width =0;
            this.length = 0;
        } else if ((width<0) && (length>0)) {
            this.width = 0;
            this.length =length;
        } else if ((width>0) && (length<0)) {
            this.width = width;
            this.length = 0;
        }else {
            this.width = width;
            this.length = length;
        }

        }

    public double getWidth(){
        return this.width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return (width * length);
    }


}
