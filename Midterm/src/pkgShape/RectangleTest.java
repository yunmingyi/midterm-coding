package pkgShape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle o1 =new Rectangle(2,3);
		//Test Construction
		
		int width = o1.getiWidth();
		int length = o1.getiLength();
		System.out.println(width);
		System.out.println(length);
//		//Test getter
//		
		o1.setiWidth(5);
		o1.setiLength(7);
		System.out.println(o1.getiWidth());
		System.out.println(o1.getiLength());
//		//Test setter
		
		System.out.println("Area of o1: " + o1.area());
		System.out.println("Perimeter of o1: " + o1.perimeter());
		//Test area and perimeter
		
		Rectangle o2 = new Rectangle(4,6);
		Rectangle o3 = new Rectangle(2,2);
		System.out.println(o2.compareTo(o3));
		//Test compareTo
		
	}
}
