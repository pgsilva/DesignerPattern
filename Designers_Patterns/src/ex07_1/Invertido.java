package ex07_1;

public class Invertido extends Template {

	@Override
	String transforma(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}