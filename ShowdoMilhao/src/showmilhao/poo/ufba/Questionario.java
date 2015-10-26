package showmilhao.poo.ufba;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.csvreader.CsvReader;

public class Questionario {

	public static void main(String[] args) {
		try {
			
			CsvReader perguntas = new CsvReader("perguntas.csv");
		
			perguntas.readHeaders();

			while (perguntas.readRecord())
			{
				String nivel = perguntas.get("nivel");
				String pergunta = perguntas.get("pergunta");
				String resposta1 = perguntas.get("resposta1");
				String resposta2 = perguntas.get("resposta2");
				String resposta3 = perguntas.get("resposta3");
				String resposta4 = perguntas.get("resposta4");
				String respostaCerta = perguntas.get("respostaCerta");
				
				
				// perform program logic here
				System.out.println(nivel + ": " + pergunta + " : " + resposta1 + " : " + resposta2 +  " : " +resposta3 + " : " + resposta4 + " : " + respostaCerta);
			}
	
			perguntas.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
