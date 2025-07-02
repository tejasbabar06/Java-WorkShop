
public class Program {

	public static void main(String[] args) {
		//Converting primitive to wrapper --> Boxing 
		int a = 10;
		Integer b = new Integer(a); // Boxing 
		
		//Converting wrapper to primitive -> unboxing 
		int c = b.intValue(); // Unboxing  

	}

}
