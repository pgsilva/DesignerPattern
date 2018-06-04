package ex08_2;

public class Run {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//poderia receber a nova edicao atraves de um recurso externo
		int novaEdicao = 3;
		Noticiario revistaInformatica = new Noticiario();
		Noticiario revistaInformatica1 = new Noticiario();
		Agregador assinante2 = new Agregador(revistaInformatica1, "java");
		Publicador assinante1 = new Publicador(revistaInformatica);
		
		revistaInformatica.setNovaEdicao(novaEdicao);
		revistaInformatica1.setNovaEdicao(1);
		revistaInformatica1.setNovaEdicao(2);
		revistaInformatica1.setNovaEdicao(3);
		revistaInformatica1.setNovaEdicao(4);
		revistaInformatica1.setNovaEdicao(5);
		revistaInformatica1.setNovaEdicao(6);
		revistaInformatica1.setNovaEdicao(7);
		revistaInformatica1.setNovaEdicao(8);
		revistaInformatica1.setNovaEdicao(9);
		revistaInformatica1.setNovaEdicao(10);
	}

}
