package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	private int iDepth;
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
	}
	
	public int getiDepth() {
		return iDepth;
	}
	public void setiDepth(int a) {
		iDepth = a;
	}
	
	public double volume() {
		return getiWidth()*getiLength()*iDepth;
	}
	
	public double area() {
		double all = 2*(getiWidth()*getiLength())+2*(getiWidth()*iDepth)+2*(iDepth*getiLength());
		return all;
	}
	
	public double perimeter() {
		try {
			throw new UnsupportedOperationException();
		} catch(Exception e) {
			throw e;
		}
	}
	
	public int compareTo(Cuboid o1) {
		if (this.volume()>o1.volume())
			return 1;
		else if (this.volume()==o1.volume())
			return 0;
		else
			return -1;
		
		}
}
	

