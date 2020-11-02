public class Tester{

	public static void main(String[] args){
		Point pointA = new Point(1,1);
		Point pointB = new Point(9,1);
		Point pointC = new Point(9.0,1.0);
		Point pointD = new Point(14,6);
		Point pointE = new Point(5,8);

		System.out.println(pointA.distanceTo(pointB));
		System.out.println(pointB.distanceTo(pointC));
		System.out.println(pointA.distanceTo(pointE));

		System.out.println(pointA.equals(pointB));
		System.out.println(pointC.equals(pointB));

	}
}
