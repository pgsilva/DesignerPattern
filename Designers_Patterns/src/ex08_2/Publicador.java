package ex08_2;

import java.util.Observable;
import java.util.Observer;

public class Publicador implements Observer {

	Observable revistaInformatica;

	int edicaoNovaRevista;

	public Publicador(Observable revistaInformatica) {
		this.revistaInformatica = revistaInformatica;
		revistaInformatica.addObserver(this);
	}

	@Override
	public void update(Observable revistaInfSubject, Object arg1) {
		if (revistaInfSubject instanceof Noticiario) {
			Noticiario revistaInformatica = (Noticiario) revistaInfSubject;
			edicaoNovaRevista = revistaInformatica.getEdicao();
			System.out.println(" Aten��o, j� chegou mais uma noticia na nossa Revista de Informatica favorita. "
					+ "Esta � a noticia n�mero: " + edicaoNovaRevista );
		}
	}
}