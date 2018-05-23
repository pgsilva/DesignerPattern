package ex02_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ProvedoraInformacaoConfidencial implements FabricaProvedoraInformacao {

	@Override
	public String proverInformacao(String senha) {
		String dados = "";
		if(senha.equals("123")) {
			try {
				File file = new File("C:\\Users\\arqdsis\\git\\confidencial.txt");
				dados = new String(Files.readAllBytes(file.toPath()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			return dados;
		}
		return "";
	}

}