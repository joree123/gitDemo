package oop6;

public class Area extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape a=new Area();
a.circleArea(5);
a.rectArea(4, 5);
a.squareArea(5);
	}

	@Override
	public void rectArea(int length, int width) {
		// TODO Auto-generated method stub
		long area=length*width;
		System.out.println("THe area of rectangle is"+ area);
	}

	@Override
	public void squareArea(int side) {
		// TODO Auto-generated method stub
		long area=side*side;
		System.out.println("The area of the square is" + area);
	}

	@Override
	public void circleArea(float radius) {
		double area=3.14*radius*radius;
		// TODO Auto-generated method stub
		System.out.println("The area of circle is "+ area);
	}

}
