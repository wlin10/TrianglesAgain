public class Point{

  private double x, y;

  public Point(double X, double Y) {
    x = X;
    y = Y;
  }
  public Point(Point p) {
    x = p.x;
    y = p.y;
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }

  public double distanceTo(Point other) {
    double a = (this.getX() - other.getX());
    double b = (this.getY() - other.getY());
    return (Math.sqrt((a*a)+(b*b)));
  }
  public boolean equals(Point other) {
    return (this.getX() == other.getX() && this.getY() == other.getY());
  }

}
