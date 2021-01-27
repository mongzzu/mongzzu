package mongzzu;

import java.util.Scanner;

class Circle{
	private double x,y;
	private int r;
	
	Circle(double x,double y,int r){
		this.x=x;
		this.y=y;
		this.r=r;
	}
	void show() {
		System.out.println(x+" "+y+" "+r);
	}
}
public class test4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Circle a[]=new Circle[3];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("실수 2개 정수 1개");
			Double x=s.nextDouble();
			Double y=s.nextDouble();
			int r=s.nextInt();
			a[i]=new Circle(x,y,r);
		}
		for(int i=0;i<a.length;i++) {
			a[i].show();
		}

	}

}
