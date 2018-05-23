package ex02_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ProvedoraInformacaoPublica implements FabricaProvedoraInformacao {

	@Override
	public String proverInformacao(String senha) {
		String dados = "";
		try {
			File file = new File("C:\\Users\\arqdsis\\git\\publico.txt");
			dados = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dados;
	}

}