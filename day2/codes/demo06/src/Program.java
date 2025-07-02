
public class Program {

	public static void main(String[] args) {
		// converting primitive to wrapper -> Boxing 
		int i = 10;
		Integer j = new Integer(i); // Boxing 
		Integer k = i; // auto-boxing (java 5.0) 
		
		//Converting wrapper to primitive -> Unboxing 
		Integer x = new Integer(10); 
		int y = x.intValue(); // Unboxing 
		int z = x; // auto-unboxing (java 5.0) 
	}

}
