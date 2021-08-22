package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i= 1; i <= n; i ++) {
			
			System.out.println("Shape #" + n  +" data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char form = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(form == 'r') 
			{				
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.println("Height: ");
				double height = sc.nextDouble();
				
				Rectangle rectangle = new Rectangle(color, width, height);
				
				list.add(rectangle);
			}
			else 
			{				
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				
				Circle circle = new Circle(color, radius);
				
				list.add(circle);
				
			}
			
			for (Shape shape : list) {
				System.out.println(shape.area());
			}
		}
		sc.close();
	}	
}
