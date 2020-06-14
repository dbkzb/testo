package klaus15;

import java.awt.Point;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Reflction {
	
	public static void main(String[] args) throws Exception {
		Point p=new Point();
		@SuppressWarnings("unchecked")
		Class<Point> c1=(Class<Point>) p.getClass();
		@SuppressWarnings("unchecked")
		Class<Point> c2=(Class<Point>) Class.forName("java.awt.Point");
		Class<Point> c3=Point.class;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		c1.isInstance(c1);
		System.out.println(c2.getSuperclass());
		System.out.println(Arrays.toString(c3.getInterfaces()));
		//Point p1 = new Point();
		Point p1=(Point) c1.newInstance();
		System.out.println(p1.x + " "+ p1.y);
		Constructor<Point> co= c1.getConstructor();
		Point p2=co.newInstance();
		Field i=c1.getField("x");
		i.setInt(p1, 15);
		System.out.println(i.getInt(p1));
	}
}
