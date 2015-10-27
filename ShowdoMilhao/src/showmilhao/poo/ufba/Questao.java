package showmilhao.poo.ufba;

import java.util.List;
import java.util.ArrayList;

public class Questao {
	
	String pergunta;
	
	//List <String> respostas;
	String resposta1;

	String resposta2;
	
	String resposta3;
	
	String resposta4;
	
	String respostaCorreta;
	
	String	nivel;
	
	String	valor;
	
	String	numeracao;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	//List<String> respostas
	public Questao(String pergunta, String resposta1,String resposta2,String resposta3,String resposta4,
			String respostaCorreta, String nivel, String valor, String numeracao) {
		super();
		this.pergunta = pergunta;
		//this.respostas = respostas;
		this.resposta1 = resposta1;
		this.resposta2 = resposta2;
		this.resposta3 = resposta3;
		this.resposta4 = resposta4;
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

	/*public List <String> getRespostas() {
		return respostas;
	}*/

	/*public void setRespostas(List <String> respostas) {
		this.respostas = respostas;
	}*/

	public String getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}
	
	public String getResposta1() {
		return resposta1;
	}
	public void setResposta1(String resposta1) {
		this.resposta1 = resposta1;
	}
	public String getResposta2() {
		return resposta2;
	}
	public void setResposta2(String resposta2) {
		this.resposta2 = resposta2;
	}
	public String getResposta3() {
		return resposta3;
	}
	public void setResposta3(String resposta3) {
		this.resposta3 = resposta3;
	}
	public String getResposta4() {
		return resposta4;
	}
	public void setResposta4(String resposta4) {
		this.resposta4 = resposta4;
	}

}
