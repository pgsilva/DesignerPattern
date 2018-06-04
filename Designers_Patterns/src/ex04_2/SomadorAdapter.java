package ex04_2;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<>();
		for (int numero : vetor) {
			lista.add(numero);
		}
		return somaLista(lista);
	}

}
