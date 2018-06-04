package ex01_1;
/**
 * 
 * @author Paulo Guilherme da Silva 816113977
 *
 */

public class Run {

	public static void main(String[] args) {

		AbstractHelloWorld helloWorld = new PrintHelloWorld();
		helloWorld.printHelloWord();

		helloWorld = new WriteHelloWorld();
		helloWorld.printHelloWord();

	}

}