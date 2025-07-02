
public class Program {

	public static void main(String[] args) {
		//Wrapper classes 
		int a = 10;
		Integer i = new Integer(a); 
		
		// type-conversion 
		double d = i.doubleValue(); 
		// Integer => double 
		
		float f = i.floatValue(); 
		// Integer => float 
		
		byte b = i.byteValue(); 
		//Integer => byte 
		
		// Helper function 
		int max = Integer.max(50, 70); 
		System.out.println("Max : "+max);
	}

}
