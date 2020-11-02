public class Tester{

	public static void main(String[] args){
		Point pointA = new Point(1,1);
		Point pointB = new Point(9,1);
		Point pointC = new Point(9.0,1.0);
		Point pointD = new Point(14,6);
		Point pointE = new Point(5,8);

		Triangle triangleA = new Triangle(pointA, pointD, pointE);
		Triangle triangleB = new Triangle(6, 32, 5, 16, 25, 13);

		System.out.println(pointA.distanceTo(pointB));
		System.out.println(pointB.distanceTo(pointC));
		System.out.println(pointA.distanceTo(pointE));

		System.out.println(pointA.equals(pointB));
		System.out.println(pointC.equals(pointB));

		System.out.println(triangleA.getPerimeter());
		System.out.println(triangleB.getPerimeter());

		System.out.println(triangleA.getArea());
		System.out.println(triangleB.getArea());

	}
}
