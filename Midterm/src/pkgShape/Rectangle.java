package pkgShape;

public class Rectangle extends Shape{
	private int iWidth;
	private int iLength;
	public Rectangle(int iWidth, int iLength) {
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int a) {
		iWidth = a;
	}
	
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int a) {
		iLength = a;
	}
	
	@Override
	public double area() {
		return iWidth*iLength;
	}

	@Override
	public double perimeter() {
		return 2*iWidth+2*iLength;
	}
	
	public int compareTo(Rectangle o1) {
		if (this.area() > o1.area()) {
			return 1;
		}
		else if (this.area() == o1.area()) {
			return 0;
		}
		else return -1;
	}
	
}
