package showmilhao.poo.ufba;

import java.util.List;
import java.util.ArrayList;

public class Questao {
	
	String pergunta;
	
	List <String> respostas;
	
	String respostaCorreta;
	
	int	nivel;
	
	int	valor;
	
	int	numeracao;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public Questao(String pergunta, List<String> respostas,
			String respostaCorreta, int nivel, int valor, int numeracao) {
		super();
		this.pergunta = pergunta;
		this.respostas = respostas;
		this.respostaCorreta = respostaCorreta;
		this.nivel = nivel;
		this.valor = valor;
		this.numeracao = numeracao;
	}
	
	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public List <String> getRespostas() {
		return respostas;
	}

	public void setRespostas(List <String> respostas) {
		this.respostas = respostas;
	}

	public String getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}

}
