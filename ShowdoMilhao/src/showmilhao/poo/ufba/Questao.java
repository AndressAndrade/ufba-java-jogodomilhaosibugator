package showmilhao.poo.ufba;

import java.util.HashSet;
import java.util.Set;

public class Questao {
	
	String pergunta;
	
	Set <String> respostas;
	
	String respostaCorreta;
	
	int	nivel;
	
	int	valor;
	
	int	numeracao;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> rq1 = new HashSet<String>();
		rq1.add("Andressa");
		rq1.add("Susi");
		
		Questao q1 = new Questao("Qual seu nome?",rq1,(String)rq1.toArray()[0],1,100,1);
		
		Set<String> rq2 = new HashSet<String>();
		rq2.add("Andressa");
		rq2.add("Susi");
		
		Questao q2 = new Questao("Qual seu nome?",rq2,(String)rq2.toArray()[0],1,100,2);
		
	}

	public Questao(String pergunta, Set<String> respostas,
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

	public Set<String> getRespostas() {
		return respostas;
	}

	public void setRespostas(Set<String> respostas) {
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
