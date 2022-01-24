package dev.knoxy;

//java.math.*;

public class Cuboid {
    //zSide shares length with yside length and width with xside length
    //ySide shares length with zside and width with xside width 
    //height is xSide width, width is xside length, length is yside length
    
    private Rectangle zSide;
    private Rectangle ySide;
    private Rectangle xSide;
    private double volume;
    private double surfaceArea;
    public Cuboid(){
        
        this.surfaceArea = (zSide.getArea()*2)
         + (this.ySide.getArea()*2)
          + (this.xSide.getArea()*2);
        this.volume = this.zSide.getArea()*xSide.getWidth();
    }
    public Cuboid(double length, double width, double height){
        this.zSide = new Rectangle(width,length);
        this.ySide = new Rectangle(height,length);
        this.xSide = new Rectangle(height,width);
        
        this.surfaceArea = (zSide.getArea()*2)
         + (this.ySide.getArea()*2)
          + (this.xSide.getArea()*2);
        this.volume = this.zSide.getArea()*xSide.getWidth();

    }
    public double getVolume(){
        return volume;
    }
    public void setVolume(double vol){
        this.volume = vol;
    }
    public double getLength(){
        return this.zSide.getLength();
    }
    public void setLength(double len){
        this.zSide.setLength(len);
    }
    public double getWidth(){
        return this.xSide.getLength();
    }
    public void setWidth(double w){
        this.xSide.setLength(w);
    }
    public double getHeight(){
        return this.xSide.getWidth();
    }
    public void setHeight(double h){}
    public double getSurfaceArea(){
        return this.surfaceArea;
    }
    public void setSurfaceArea(double sa){
        this.surfaceArea = sa;
    }

    
}
