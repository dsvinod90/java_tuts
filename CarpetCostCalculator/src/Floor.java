public class Floor {
  private double length;
  private double width;

  public Floor(double length, double width) {
    if(width < 0) {
      this.width = 0;
    } else {
      this.width = width;
    }
    if(length < 0) {
      this.length = 0;
    } else {
      this.length = length;
    }
  }

  public double getArea() {
    return(this.length * this.width);
  }
}
