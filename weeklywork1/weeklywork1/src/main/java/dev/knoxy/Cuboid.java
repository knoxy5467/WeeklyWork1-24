package dev.knoxy;

/*I decided to use rectangles as faces because it has potential to be more future proof
if we were creating a true 3d environment a face would be made of edges, edges would be made from points which would have 3 coordinates.
this implementation would allow for esier refactoring if it is ever needed */

public class Cuboid {
    //zSide shares length with yside length and width with xside length
    //ySide shares length with zside and width with xside width 
    //height is xSide width, width is xside length, length is yside length
    //TODO: make sure that this works and needs no debugging
    private Rectangle zSide;
    private Rectangle ySide;
    private Rectangle xSide;
    private double volume;
    private double surfaceArea;
    public Cuboid(){
        double  width, length, height;
        width = length = height = 1;

        this.zSide = new Rectangle(width,length);
        this.ySide = new Rectangle(height,length);
        this.xSide = new Rectangle(height,width);
        
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
    public double getPerimeter(){
        return getLength()*4+getHeight()*4+getWidth()*4;
    }

    
}
