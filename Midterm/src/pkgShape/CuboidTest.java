package pkgShape;

import java.util.ArrayList;
import java.util.Collections;

public class CuboidTest {
	public static void main(String[] args)
	{
		Cuboid o1 = new Cuboid(2,3,4);
		// test construction
	
		int iDepth =o1.getiDepth();
		System.out.println("iDepth: " + iDepth);
		o1.setiDepth(5);
		System.out.println("New iDepth: " + o1.getiDepth());
		//test getter and setter
		
		System.out.println("Area of o1: " + o1.area());
		System.out.println("Voulme of o1: " + o1.volume());
		//test area and volume
		
		boolean thrown = false;
		try {
			o1.perimeter();
		}catch(UnsupportedOperationException e) {
			thrown = true;
		}
		System.out.println(thrown);
		//test perimeter
		
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		ar.add(new Cuboid(4, 4, 4));
		ar.add(new Cuboid(2, 3, 7));
		ar.add(new Cuboid(3, 3, 3));
		
		System.out.println("Unsorted");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar,new SortByArea());
		
		System.out.println("sorted by Area");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));
		//test SortByArea
		
		Collections.sort(ar,new SortByVolume());
		
		System.out.println("sorted by volume");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));
		//test SortByVolume
	}
}
