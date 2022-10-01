//class DataBase {
//	
//	private static DataBase dbObject;
//	private static String fullName;
//	
//	private  DataBase() {
//		
//	}
//	
//	public static DataBase getInstance(){	
//		if(dbObject == null) {
//			dbObject = new DataBase();
//		}
//		return dbObject;
//		
//	}
//	
//	public void getConnection() {
//		System.out.println("you are connect to Database");
//	}
//	
//	
//}
//
//public class SinglePattern {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		DataBase obj ;
//		obj = DataBase.getInstance();
//		obj.getConnection();
//		
//		//DataBase c = new DataBase();
//		
//		
//	}
//
//}
