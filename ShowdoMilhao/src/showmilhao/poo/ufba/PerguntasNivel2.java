package showmilhao.poo.ufba;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class PerguntasNivel2 {
	
	public static void main(String[] args) {
	
		String [][] quiz = new String[10][5];
		
		/* Array inicial criado: matriz de 10 linhas e 5 colunas
		 * Coluna 0 : Perguntas (10 arbitrárias somente para teste)
		 * Coluna 1 : Resposta Certa - r
		 * Coluna 2 : Alternativa Errada 1 - a
		 * Coluna 3 : Alternativa Errada 2 - b
		 * Coluna 4 : Alternativa Errada 3 - c
		 */
	
		/*Abaixo, espaço para escrevermos as perguntas e alternativas depois
		 * Nomes inseridos inicialmente apenas para teste
		 */
	
	    quiz[0][0] = "pergunta0";
	    quiz[0][1] = "r";
	    quiz[0][2] = "a";
	    quiz[0][3] = "b";
	    quiz[0][4] = "c";
	    
	    quiz[1][0] = "pergunta1";
	    quiz[1][1] = "r";
	    quiz[1][2] = "a";
	    quiz[1][3] = "b";
	    quiz[1][4] = "c";
	    
	    quiz[2][0] = "pergunta2";
	    quiz[2][1] = "r";
	    quiz[2][2] = "a";
	    quiz[2][3] = "b";
	    quiz[2][4] = "c";
	    
	    quiz[3][0] = "pergunta3";
	    quiz[3][1] = "r";
	    quiz[3][2] = "a";
	    quiz[3][3] = "b";
	    quiz[3][4] = "c";
	    
	    quiz[4][0] = "pergunta4";
	    quiz[4][1] = "r";
	    quiz[4][2] = "a";
	    quiz[4][3] = "b";
	    quiz[4][4] = "c";
	    
	    quiz[5][0] = "pergunta5";
	    quiz[5][1] = "r";
	    quiz[5][2] = "a";
	    quiz[5][3] = "b";
	    quiz[5][4] = "c";
	    
	    quiz[6][0] = "pergunta6";
	    quiz[6][1] = "r";
	    quiz[6][2] = "a";
	    quiz[6][3] = "b";
	    quiz[6][4] = "c";
	    
	    quiz[7][0] = "pergunta7";
	    quiz[7][1] = "r";
	    quiz[7][2] = "a";
	    quiz[7][3] = "b";
	    quiz[7][4] = "c";
	    
	    quiz[8][0] = "pergunta8";
	    quiz[8][1] = "r";
	    quiz[8][2] = "a";
	    quiz[8][3] = "b";
	    quiz[8][4] = "c";
	    
	    quiz[9][0] = "pergunta9";
	    quiz[9][1] = "r";
	    quiz[9][2] = "a";
	    quiz[9][3] = "b";
	    quiz[9][4] = "c";
	 
	    
	    //Colocando todas as perguntas em uma ordem aleatória
	    List <Integer> indicesLinhas = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {     //utilizando o comprimento arbitrário de 10 linhas
			indicesLinhas.add(i);
		}
		
		Collections.shuffle(indicesLinhas);
	
		
		//criando a matriz aleatória com os elementos da original
		
		String perguntas_Nivel2[][] = new String[5][5];
		
		for (int i = 0; i < 5; i++) {
			int linha = indicesLinhas.get(i);
			
			perguntas_Nivel2[i][0] = quiz[linha][0];
			perguntas_Nivel2[i][1] = quiz[linha][1];
			perguntas_Nivel2[i][2] = quiz[linha][2];
			perguntas_Nivel2[i][3] = quiz[linha][3];
			perguntas_Nivel2[i][4] = quiz[linha][4];
			}	
		
		
	}
	   
}

