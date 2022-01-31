package dev.knoxy;

public class Cube extends Cuboid{
    private double side;

    public Cube() {
        super();
        this.side = 1;
    }

    public Cube(double side) {
        super(side,side,side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    
    
}
