public class Cylinder extends Circle {
  private double height;

  public Cylinder(double radius, double height) {
    super(radius);
    if(height < 0) {
      this.height = 0;
    } else {
      this.height = height;
    }
  }

  public double getHeight() {
    return height;
  }

  public double getVolume() {
    return (height * getRadius());
  }

  public double getArea() {
    return(((2*Math.PI*getRadius()*height)) + (2*super.getArea()));
  }
}
