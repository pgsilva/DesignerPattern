package ex07_1;


public class Duplicado extends Template {

	@Override
	String transforma(String s) {
		return s + s;
	}

}