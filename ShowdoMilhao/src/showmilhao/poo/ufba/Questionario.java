package showmilhao.poo.ufba;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.csvreader.CsvReader;

public class Questionario {
	
	static List<Questao> listaQuestoes = new ArrayList();
	static List<Questao> listaQuestoes2 = new ArrayList();
	static List<Questao> listaQuestoes3 = new ArrayList();
	static List<Questao> listaQuestoes4 = new ArrayList();

	public static void main(String[] args) {
		
		try {
			
			CsvReader questoes = new CsvReader("perguntas.csv");
		
			questoes.readHeaders();
			
			String um = "1";
			String dois = "2";
			String tres = "3";
			String quatro = "4";
			
			while (questoes.readRecord())
			{
				
				String nivel = questoes.get("Nivel");
				String pergunta = questoes.get("Pergunta");
				String resposta1 = questoes.get("Resposta1");
				String resposta2 = questoes.get("Resposta2");
				String resposta3 = questoes.get("Resposta3");
				String resposta4 = questoes.get("Resposta4");
				String respostaCerta = questoes.get("RespostaCerta");
				String valor = questoes.get("Valor");
				String numeracao = questoes.get("Numeracao");
				
				if(um.equals(nivel)){
					System.out.println(nivel + " : " + pergunta + " : " +resposta1 +" : " + resposta2 + " : " +resposta3 + " : " +resposta4 + " : " +respostaCerta +" : " + valor +" : " + numeracao);
					//Questao questao = new Questao(nivel,pergunta,resposta1,resposta2,resposta3,resposta4,respostaCerta,valor,numeracao);
					//listaQuestoes.add(questao);
					
				}
				if(dois.equals(nivel)){
					System.out.println(nivel + " : " + pergunta + " : " +resposta1 +" : " + resposta2 + " : " +resposta3 + " : " +resposta4 + " : " +respostaCerta +" : " + valor +" : " + numeracao);
					//Questao questao = new Questao(nivel,pergunta,resposta1,resposta2,resposta3,resposta4,respostaCerta,valor,numeracao);
					//listaQuestoes2.add(questao);
				}
				if(tres.equals(nivel)){
					
					//Questao questao = new Questao(nivel,pergunta,resposta1,resposta2,resposta3,resposta4,respostaCerta,valor,numeracao);
					//listaQuestoes3.add(questao);
					
				}
				if(quatro.equals(nivel)){
					
					//Questao questao = new Questao(nivel,pergunta,resposta1,resposta2,resposta3,resposta4,respostaCerta,valor,numeracao);
					//listaQuestoes4.add(questao);
				}
			}
	
			//embaralhando a lista de Questões
			Collections.shuffle(listaQuestoes);
			Collections.shuffle(listaQuestoes2);
			Collections.shuffle(listaQuestoes3);
			Collections.shuffle(listaQuestoes4);
			
			questoes.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
