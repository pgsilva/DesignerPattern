package ex01_1;

/**
 * 
 * @author Paulo Guilherme da Silva 816113977
 *
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteHelloWorld implements AbstractHelloWorld {
	
	BufferedWriter writer = null;
	
	@Override
	public void printHelloWord() {
		File file = new File("../hello_world.txt");
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write("oi Mundao");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}