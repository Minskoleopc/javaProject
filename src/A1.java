
public interface A1 {
	void getName(String name);
	
}
interface A2 {
	void getAge(int age);
}
interface A3 {
	void getCity(String city);
}

class GetInfo implements A1,A2,A3{

	@Override
	public void getCity(String city) {
		System.out.println("City :"+city);
		
	}

	@Override
	public void getAge(int age) {
		// TODO Auto-generated method stub
		System.out.println("Age :"+age);
	}

	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name :"+name);
	}
	
}