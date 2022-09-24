
public interface B1 {
	void getColor(String color);
	void getModelNumber(int modelNumber);
}

interface B2 extends B1 {
	void getCompanyName(String companyName);
	
}

class VehicleInfo  implements B2{

	@Override
	public void getColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("Color:" + color);
	}

	@Override
	public void getModelNumber(int modelNumber) {
		// TODO Auto-generated method stub
		System.out.println("Model Number:" + modelNumber);
	}

	@Override
	public void getCompanyName(String companyName) {
		// TODO Auto-generated method stub
		System.out.println("Company Name:" + companyName);
		
	}
	
}