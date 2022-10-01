
class Database {
	private static String dbName = "oracle";
	private static Database dbobject; 
	
	// Make the constructor private
	private Database() {
		
	}
	
	public static Database getInstance() {
		if(dbobject == null) {
			dbobject = new Database();
		}
		return dbobject;
		
	}
	
	public void getConnection() {
		System.out.println(" Connecting to Data base");
		System.out.println(this.dbName);
	}
	
	
	
	
	
//	String fullName = "chinmay deshpande";
//	public void display() {
//		System.out.println("hello I am display method");
//	}
}



public class SinglePatterRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Database Aa =   Database.getInstance();
		Aa.getConnection();
		
		Database Ba =   Database.getInstance();
		Ba.getConnection();
		
		
		
		
		
		//new Database();
		
	
//		Database A = new Database();
//		System.out.println(A.fullName);
//		A.display();
//		
//		Database B = new Database();
//		System.out.println(B.fullName);
//		B.display();
//		
		
	}

}
