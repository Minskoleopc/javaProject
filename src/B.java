public interface B {
	
	void getMethodB1(String method1);
	void getMethodB2(String method2);
	void getMethodB3(String method3);

}

interface D {
	void getMethodD1(String method1);
	void getMethodD2(String method2);
	void getMethodD3(String method3);

}

class C implements B, D {

	@Override
	public void getMethodD1(String method1) {
		// TODO Auto-generated method stub
		System.out.println("dmethod1:"+method1);
	}

	@Override
	public void getMethodD2(String method2) {
		// TODO Auto-generated method stub
		System.out.println("dmethod2"+method2);
	}

	@Override
	public void getMethodD3(String method3) {
		// TODO Auto-generated method stub
		System.out.println("dmethod3"+ method3);
	}

	@Override
	public void getMethodB1(String method1) {
		// TODO Auto-generated method stub
		System.out.println("bmethod1"+method1);
	}

	@Override
	public void getMethodB2(String method2) {
		// TODO Auto-generated method stub
		System.out.println("bmethod2:" +method2);
	}

	@Override
	public void getMethodB3(String method3) {
		// TODO Auto-generated method stub
		System.out.println("bmethod3" + method3);
		
	}
	
}