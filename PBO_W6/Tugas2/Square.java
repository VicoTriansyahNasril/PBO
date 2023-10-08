package Tugas2;

public class Square extends Rectangle{

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public  double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "Square side = " + getSide() + ", Subclass of " + super.toString();
    }
}
