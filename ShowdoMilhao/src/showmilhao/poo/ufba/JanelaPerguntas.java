package showmilhao.poo.ufba;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class JanelaPerguntas implements ActionListener {

	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	static  JLabel	pergunta;
	static  JButton res[] = new JButton[4];
	JButton parar = new JButton();
	JButton  pular;
	
	JLabel  acertar;
	JLabel  errar;
	JLabel  pulos;
	
	JFrame w1;
	
	int nDePulos = 3;
	
	static int acertos = 0;
	
	static List<Questao> listaQuestoes = new ArrayList();
	
	
	public static void main(String[] args) {
		
		//um molde de 10 perguntas aleatórias -> falta inserir os dados
		
		List<String> rq1 = new ArrayList<String>();
		Questao q1 = new Questao("Qual era a cor do cavalo branco de Napoleão?", rq1, "azul", 1, 500, 1);
		rq1.add("branco");
		rq1.add("azul");
		rq1.add("amarelo");
		rq1.add("preto");
		
		List<String> rq2 = new ArrayList<String>();
		Questao q2 = new Questao("pergunta2", rq2, "c", 1, 500, 2);
		rq2.add("e");
		rq2.add("e");
		rq2.add("c");
		rq2.add("e");
		
		List<String> rq3 = new ArrayList<String>();
		Questao q3 = new Questao("pergunta3", rq3, "c", 1, 500, 3);
		rq3.add("c");
		rq3.add("e");
		rq3.add("e");
		rq3.add("e");
		
		List<String> rq4 = new ArrayList<String>();
		Questao q4 = new Questao("pergunta4", rq4, "c", 1, 500, 4);
		rq4.add("e");
		rq4.add("c");
		rq4.add("e");
		rq4.add("e");
		
		List<String> rq5 = new ArrayList<String>();
		Questao q5 = new Questao("pergunta5", rq5, "c", 1, 500, 5);
		rq5.add("e");
		rq5.add("e");
		rq5.add("c");
		rq5.add("e");
		
		List<String> rq6 = new ArrayList<String>();
		Questao q6 = new Questao("pergunta6", rq6, "c", 1, 500, 6);
		rq6.add("e");
		rq6.add("e");
		rq6.add("e");
		rq6.add("c");
		
		List<String> rq7 = new ArrayList<String>();
		Questao q7 = new Questao("pergunta7", rq7, "c", 1, 500, 7);
		rq7.add("e");
		rq7.add("e");
		rq7.add("e");
		rq7.add("c");
		
		List<String> rq8 = new ArrayList<String>();
		Questao q8 = new Questao("pergunta8", rq8, "c", 1, 500, 8);
		rq8.add("e");
		rq8.add("e");
		rq8.add("e");
		rq8.add("c");
		
		List<String> rq9 = new ArrayList<String>();
		Questao q9 = new Questao("pergunta9", rq9, "c", 1, 500, 9);
		rq9.add("e");
		rq9.add("e");
		rq9.add("e");
		rq9.add("c");
		
		List<String> rq10 = new ArrayList<String>();
		Questao q10 = new Questao("pergunta10", rq10, "c", 1, 500, 10);
		rq10.add("c");
		rq10.add("e");
		rq10.add("e");
		rq10.add("e");
		
		
		//Criando uma lista p/ embaralhar as questões
		listaQuestoes.add(q1);
		listaQuestoes.add(q2);
		listaQuestoes.add(q3);
		listaQuestoes.add(q4);
		listaQuestoes.add(q5);
		listaQuestoes.add(q6);
		listaQuestoes.add(q7);
		listaQuestoes.add(q8);
		listaQuestoes.add(q9);
		listaQuestoes.add(q10);
		
		//embaralhando a lista de Questões
		Collections.shuffle(listaQuestoes);
		
		//janelas de perguntas
		if (acertos != 5) {
			new JanelaPerguntas();
			setarCaixa();
		}
		

	}
	
	
	public JanelaPerguntas(){
		w1 = new JFrame();
		w1.setSize(420,450);
		w1.setLocation((int)(dim.getWidth()-420)/2,(int)(dim.getHeight()-450)/2);
		w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w1.setVisible(true);
		w1.setLayout(null);
		
		pergunta = new JLabel("Perguntas aqui:");
		pergunta.setBounds(52,15,300,40);
		w1.add(pergunta);
		
		res[0] = new JButton("	");
		res[0].setBounds(52,80,300,40);
		w1.add(res[0]);
		
		res[1] = new JButton("	");
		res[1].setBounds(52,140,300,40);
		w1.add(res[1]);
		
		res[2] = new JButton("	");
		res[2].setBounds(52,200,300, 40);
		w1.add(res[2]);
		
		res[3] = new JButton("	");
		res[3].setBounds(52, 260,300, 40);
		w1.add(res[3]);
		
		parar = new JButton("PARAR");
		parar.setBounds(272, 340,80, 40);
		w1.add(parar);
		
		pular = new JButton("PULAR");
		pular.setBounds(172, 340, 80, 40);
		w1.add(pular);
		
		acertar = new JLabel("Acertar: X reais");
		acertar.setBounds(52,320,150,40);
		w1.add(acertar);
		
		errar = new JLabel("Errar: X reais");
		errar.setBounds(52,350,150,40);
		w1.add(errar);
		
		pulos = new JLabel ("Você tem 3 pulos"); 
		pulos.setBounds(52,380,150,40);
		w1.add(pulos);
		
		parar.addActionListener(this);
		pular.addActionListener(this);
		res[0].addActionListener(this);
		res[1].addActionListener(this);
		res[2].addActionListener(this);
		res[3].addActionListener(this);
	}

	
	//função para setar as perguntas na JanelaPerguntas
	public static void setarCaixa() {
		Questao questao = listaQuestoes.get(0);
		listaQuestoes.remove(0);
		List <String> respostas = questao.respostas;
		String respostaCorreta = questao.respostaCorreta;
			
		pergunta.setText(questao.pergunta);
		res[0].setText(respostas.get(0));
		res[1].setText(respostas.get(1));
		res[2].setText(respostas.get(2));
		res[3].setText(respostas.get(3));
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == parar) {
			w1.dispose();
			JOptionPane.showMessageDialog(null, "Você acumulou X reais");
		}
		
		if (e.getSource() == pular) {		
			
			if (nDePulos > 0) {
				//falta inserir o comando para pular
				setarCaixa();
				nDePulos--;
				
				if (nDePulos != 1) {
					pulos.setText("Você tem " + nDePulos + " pulos");
				}
				else {
					pulos.setText("Você tem " + nDePulos + " pulo");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Você não tem mais pulos");
			}
		}
		
		
		//Tratamento de eventos dos botões de resposta
		if (e.getSource() == res[0]) {
			String texto = res[0].getText();
			if (texto == "c") {
				JOptionPane.showMessageDialog(null, "Resposta correta!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Perdeu tudo!");
				w1.dispose();
			}
		}
		
		if (e.getSource() == res[1]) {
			String texto = res[1].getText();
			if (texto == "c") {
				JOptionPane.showMessageDialog(null, "Resposta correta!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Perdeu tudo!");
				w1.dispose();
			}
		}
		
		if (e.getSource() == res[2]) {
			String texto = res[2].getText();
			if (texto == "c") {
				JOptionPane.showMessageDialog(null, "Resposta correta!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Perdeu tudo!");
				w1.dispose();
			}
		}
		
		if (e.getSource() == res[3]) {
			String texto = res[3].getText();
			if (texto == "c") {
				JOptionPane.showMessageDialog(null, "Resposta correta!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Perdeu tudo!");
				w1.dispose();
			}
		}
		
		
			
		
		
	}
	
}
	
