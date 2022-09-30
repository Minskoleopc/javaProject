class AnimalQ {
	
	protected String type = "animal";
}

class DogQ extends AnimalQ {
	
	public String type = "mammal";
	
	public void printType() {
		System.out.println(type);
		System.out.println(super.type);
	}
	
}



public class SuperExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DogQ dogQ = new DogQ();
		dogQ.printType();

	}

}
