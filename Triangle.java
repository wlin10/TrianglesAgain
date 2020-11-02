public class Triangle{

  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    double sideA = v1.distanceTo(v2);
    double sideB = v2.distanceTo(v3);
    double sideC = v3.distanceTo(v1);
    return (sideA + sideB + sideC);
  }

  public double getArea() {
    double sideA = v1.distanceTo(v2);
    double sideB = v2.distanceTo(v3);
    double sideC = v3.distanceTo(v1);
    double semi = (this.getPerimeter()/2);
    return (Math.sqrt((semi)*(semi-sideA)*(semi-sideB)*(semi-sideC)));
  }

  public String classify() {
    double sideA = (Math.round(v1.distanceTo(v2) * 10000)/10000.0);
    double sideB = (Math.round(v2.distanceTo(v3) * 10000)/10000.0);
    double sideC = (Math.round(v3.distanceTo(v1) * 10000)/10000.0);
    if (sideA == sideB && sideA == sideC) {
      return ("Equilateral");
    } else if (sideA == sideB) {
      return ("Isosceles");
    } else if (sideB == sideC) {
      return ("Isosceles");
    } else if (sideA == sideC) {
      return ("Isosceles");
    } else {
      return ("Scalene");
    }
  }

  public String toString() {
    return ("v1(" + v1.getX() + ", " + v1.getY() + ")" +
    " v2(" + v2.getX() + ", " + v2.getY() + ")" +
    " v3(" + v3.getX() + ", " + v3.getY() + ")");
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    }
    if (index == 1) {
      v2 = newP;
    }
    if (index == 2) {
      v3 = newP;
    }
  }

}
