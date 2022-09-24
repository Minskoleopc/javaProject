
public interface C1 {
	
	void getArea();

	//default method 
	
	default void getSides() {
		System.out.println("I can get sides of polygon");
	}

	
}

class RectangleC implements C1 {

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		int length = 6;
		int breadth = 5;
		int area = length * breadth ;
		System.out.println("The area of Recatangle :"+area);
		
	}
	public void getSides() {
		System.out.println("I have 4 sides");
	}
	
}


class SquareC implements C1 {
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		int length = 6;
		int area = length * length ;
		System.out.println("The area of Square :"+area);
	
	}
}
