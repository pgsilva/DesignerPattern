package ex07_1;

public class Run {
	
public static void main(String[] args) {
		
		Template transf = new Maiusculo();
		transf.processo();
		
		transf = new Minusculo();
		transf.processo();
		
		transf = new Duplicado();
		transf.processo();
		
		transf = new Invertido();
		transf.processo();
	
		
}

}
