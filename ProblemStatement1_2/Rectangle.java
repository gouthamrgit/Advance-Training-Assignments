package ProblemStatement1_2;



class Rectangle{
	public int length;
	public int breadth;
	public int area;

	public Rectangle() {
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public void printArea() {
		area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}


	public void printData() {
		System.out.println("Length of Rectangle is : " + length);
		System.out.println("Breadth of Rectangle is : " + breadth);
	
	}
	
}


	



