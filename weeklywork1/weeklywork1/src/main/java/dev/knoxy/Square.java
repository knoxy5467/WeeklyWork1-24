package dev.knoxy;


public class Square extends Rectangle{
    private double side;

    public Square(){
        super(1,1);
        this.side = 1;
        //really quickly, the Rectangle class perimeter and area are imutable, so if you change the length or width the area and perimeter do not change, seems like an oversight.

    }
    public Square(double side){
        super(side,side);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
       this.side = side; 
    }
}
