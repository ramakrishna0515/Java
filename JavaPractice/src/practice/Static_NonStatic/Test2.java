package practice.Static_NonStatic;

public class Test2 {
	
	/*
	 * If we have a static block 
	 * when we execute the code static block will be executed than before main method
	 * And if we initialize any variable non-static block executed and later constructor
	 */
	
	int number;
	
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Non-Static Block");
	}
	
	public Test2(){
		System.out.println("Constructor");
		number = 20;
	}

	public static void main(String[] args) {

		System.out.println("Main Method");
//		new Test2();
		Test2 t2 = new Test2();
		System.out.println(t2.number);
		
	}

}
