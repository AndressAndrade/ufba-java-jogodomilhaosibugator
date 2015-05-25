package showmilhao.poo.ufba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ler {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/Andressa/git/JogoDoMilhaoSibugator/ShowdoMilhao/src/showmilhao/poo/ufba/questionario.sibul");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String data = null;
		while((data = reader.readLine()) != null){
		    System.out.println(data);
		}
		fileReader.close();
		reader.close();
	}
}