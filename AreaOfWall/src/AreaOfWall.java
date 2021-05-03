public class AreaOfWall {
  private double width;
  private double height;

  public double getWidth() {
    return width;
  }

  public AreaOfWall() {
    this(0, 0);
  }

  public AreaOfWall(double width, double height) {
    setWidth(width);
    setHeight(height);
  }

  public void setWidth(double width) {
    if(width < 0) {
      this.width = 0;
      return;
    }
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if(height < 0) {
      this.height = 0;
      return;
    }
    this.height = height;
  }

  public double getArea() {
    return (getHeight() * getWidth());
  }
}
