package Generics;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	abstract void draw();
	
}

class Racangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}


class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
}


public class Wildcard {

	public static void drawShape(List <? extends Shape> lists) {
		for(Shape s: lists)
			s.draw();
	}
	
	
	public static void main(String[] args) {
		
		List <Rectangle> list1 = new ArrayList<>();
		list1.add(new Rectangle());
		
		List<Circle> list2 = new ArrayList<>();
		list2.add(new Circle());
		list2.add(new Circle());
		
		drawShape(list1);
		drawShape(list2);
		
		
		
		
		
		

	}

}
