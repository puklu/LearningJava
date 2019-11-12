package RectDemo;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {

       Rectangle rect = new Rectangle();
       
       Scanner sc = new Scanner(System.in);
       String clr = sc.next();
       double hgt = sc.nextDouble();
       double wd = sc.nextDouble();
       
       rect.setHeight(hgt);
       rect.setWidth(wd);
       
       System.out.println("area: "+rect.getArea());
       System.out.println("perimeter: "+rect.getPerimeter());

	}

}
