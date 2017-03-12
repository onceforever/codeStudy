
public class TestPoint {
	public static void main(String[] args) {
		Point point = new Point(9, 10, 11);
		System.out.println(point.getDistance(new Point(1, 1, 1)));
	}
}

class Point {
	private double x;
	private double y;
	private double z;

	public Point(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getDistance(Point otherPoint) {
		return Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2) + Math.pow(this.z - otherPoint.z, 2);
	}

}
