package ex07_2;

import java.util.Arrays;
import java.util.Comparator;

public class Run {
	
public static void main(String[] args) {
		
		Double[] vetor = {1.12, 5.25, 7.23, 4.86, 9.21};
		
		Comparator<Double> comparator = new PontoFlutuanteComparator();
		
		Arrays.sort(vetor, comparator);
		
		System.out.println("Ordenado pelo ponto flutuante:");
		System.out.println(Arrays.toString(vetor));
		
		
}

}
