package ex08_1;

import java.util.Observable;
import java.util.Observer;

public class Assinante1 implements Observer {

	Observable revistaInformatica;

	int edicaoNovaRevista;

	public Assinante1(Observable revistaInformatica) {
		this.revistaInformatica = revistaInformatica;
		revistaInformatica.addObserver(this);
	}

	@Override
	public void update(Observable revistaInfSubject, Object arg1) {
		if (revistaInfSubject instanceof Noticiario) {
			Noticiario revistaInformatica = (Noticiario) revistaInfSubject;
			edicaoNovaRevista = revistaInformatica.getEdicao();
			System.out.println("Atenção, já chegou mais uma noticia na nossa Revista de Informatica favorita. "
					+ "Esta é a sua edição número: " + edicaoNovaRevista);
		}
	}
}