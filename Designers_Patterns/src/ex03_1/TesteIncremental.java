package ex03_1;

public class TesteIncremental {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			IncrementalSingleton inc = IncrementalSingleton.getInstance();
			System.out.println(inc);
		}		
	}

}