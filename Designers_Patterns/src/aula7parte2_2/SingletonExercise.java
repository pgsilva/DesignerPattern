package aula7parte2_2;

public class SingletonExercise {

	public static void main(String args[]) {
		Deck deck = Deck.getInstance();
		deck.print();
	}

}