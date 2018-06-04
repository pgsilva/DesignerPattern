package ex08_2;

import java.util.Observable;
import java.util.Observer;

public class Agregador implements Observer {

	Observable revistaInformatica;

	int edicaoNovaRevista;
	String noticiaConcatenada = "" ;
	String topico;
	
	public Agregador(Observable revistaInformatica, String topico) {
		this.revistaInformatica = revistaInformatica;
		this.topico = topico;
		revistaInformatica.addObserver(this);
	}

	@Override
	public void update(Observable revistaInfSubject, Object arg1) {
		
		if (revistaInfSubject instanceof Noticiario) {
			Noticiario revistaInformatica = (Noticiario) revistaInfSubject;
			edicaoNovaRevista = revistaInformatica.getEdicao();
			noticiaConcatenada += "Atenção, já chegou mais uma noticia na nossa Revista de Informatica favorita sobre " + topico + 
					". Esta é a noticia número:" + edicaoNovaRevista + " ------ ";
			
			if(revistaInformatica.getEdicao() == 10) {
				
				System.out.println(noticiaConcatenada);
			}else {
				System.out.println("ainda nao temos 10 noticias");
			}
			
		}

	}

}
