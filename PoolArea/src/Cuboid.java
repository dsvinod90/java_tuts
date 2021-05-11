public class Cuboid extends Rectangle {
  private double height;

  public Cuboid(double length, double width, double height) {
    super(length, width);
    if(height < 0) {
      this.height = 0;
    } else {
      this.height = height;
    }
  }

  public double getVolume() {
    return(
        Double.parseDouble(
            String.format("%.2f",height * super.getArea())
        )
    );
  }

  public double getArea() {
    return (
        Double.parseDouble(
            String.format("%.2f",(2 * super.getLength() * super.getWidth()) + (2 * super.getWidth() * height) + (2 * getLength() * height))
        )
    );
  }
}
