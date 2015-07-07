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
	static  JLabel  pulos;
	
	static  JFrame  w1;
	
	int nDePulos = 3;
	
	static int acertos = 1;
	
	static List<Questao> listaQuestoes = new ArrayList();
	static List<Questao> listaQuestoes2 = new ArrayList();
	static List<Questao> listaQuestoes3 = new ArrayList();
	
	public static void main(String[] args) {
		
		//um molde de 10 perguntas aleatórias -> falta inserir os dados
		
		//perguntas nível 1
		List<String> rq1 = new ArrayList<String>();
		Questao q1 = new Questao("n1 - Qual era a cor do cavalo branco de Napoleão?", rq1, "azul", 1, 500, 1);
		rq1.add("branco");
		rq1.add("azul");
		rq1.add("amarelo");
		rq1.add("preto");
		
		List<String> rq2 = new ArrayList<String>();
		Questao q2 = new Questao("n1 - pergunta2", rq2, "c", 1, 500, 2);
		rq2.add("e");
		rq2.add("e");
		rq2.add("c");
		rq2.add("e");
		
		List<String> rq3 = new ArrayList<String>();
		Questao q3 = new Questao("n1 - pergunta3", rq3, "c", 1, 500, 3);
		rq3.add("c");
		rq3.add("e");
		rq3.add("e");
		rq3.add("e");
		
		List<String> rq4 = new ArrayList<String>();
		Questao q4 = new Questao("n1 - pergunta4", rq4, "c", 1, 500, 4);
		rq4.add("e");
		rq4.add("c");
		rq4.add("e");
		rq4.add("e");
		
		List<String> rq5 = new ArrayList<String>();
		Questao q5 = new Questao("n1 - pergunta5", rq5, "c", 1, 500, 5);
		rq5.add("e");
		rq5.add("e");
		rq5.add("c");
		rq5.add("e");
		
		List<String> rq6 = new ArrayList<String>();
		Questao q6 = new Questao("n1 - pergunta6", rq6, "c", 1, 500, 6);
		rq6.add("e");
		rq6.add("e");
		rq6.add("e");
		rq6.add("c");
		
		List<String> rq7 = new ArrayList<String>();
		Questao q7 = new Questao("n1 - pergunta7", rq7, "c", 1, 500, 7);
		rq7.add("e");
		rq7.add("e");
		rq7.add("e");
		rq7.add("c");
		
		List<String> rq8 = new ArrayList<String>();
		Questao q8 = new Questao("n1 - pergunta8", rq8, "c", 1, 500, 8);
		rq8.add("e");
		rq8.add("e");
		rq8.add("e");
		rq8.add("c");
		
		List<String> rq9 = new ArrayList<String>();
		Questao q9 = new Questao("n1 - pergunta9", rq9, "c", 1, 500, 9);
		rq9.add("e");
		rq9.add("e");
		rq9.add("e");
		rq9.add("c");
		
		List<String> rq10 = new ArrayList<String>();
		Questao q10 = new Questao("n1 - pergunta10", rq10, "c", 1, 500, 10);
		rq10.add("c");
		rq10.add("e");
		rq10.add("e");
		rq10.add("e");
		
		
		//perguntas nível 2
		List<String> rt1 = new ArrayList<String>();
		Questao t1 = new Questao("n2 - pergunta", rt1, "c", 2, 500, 1);
		rt1.add("e");
		rt1.add("c");
		rt1.add("e");
		rt1.add("e");
				
		List<String> rt2 = new ArrayList<String>();
		Questao t2 = new Questao("n2 - pergunta2", rt2, "c", 2, 500, 2);
		rt2.add("e");
		rt2.add("e");
		rt2.add("c");
		rt2.add("e");
				
		List<String> rt3 = new ArrayList<String>();
		Questao t3 = new Questao("n2 - pergunta3", rt3, "c", 2, 500, 3);
		rt3.add("c");
		rt3.add("e");
		rt3.add("e");
		rt3.add("e");
				
		List<String> rt4 = new ArrayList<String>();
		Questao t4 = new Questao("n2 - pergunta4", rt4, "c", 2, 500, 4);
		rt4.add("e");
		rt4.add("c");
		rt4.add("e");
		rt4.add("e");
				
		List<String> rt5 = new ArrayList<String>();
		Questao t5 = new Questao("n2 - pergunta5", rt5, "c", 2, 500, 5);
		rt5.add("e");
		rt5.add("e");
		rt5.add("c");
		rt5.add("e");
				
		List<String> rt6 = new ArrayList<String>();
		Questao t6 = new Questao("n2 - pergunta6", rt6, "c", 2, 500, 6);
		rt6.add("e");
		rt6.add("e");
		rt6.add("e");
		rt6.add("c");
				
		List<String> rt7 = new ArrayList<String>();
		Questao t7 = new Questao("n2 - pergunta7", rt7, "c", 2, 500, 7);
		rt7.add("e");
		rt7.add("e");
		rt7.add("e");
		rt7.add("c");
				
		List<String> rt8 = new ArrayList<String>();
		Questao t8 = new Questao("n2 - pergunta8", rt8, "c", 2, 500, 8);
		rt8.add("e");
		rt8.add("e");
		rt8.add("e");
		rt8.add("c");
				
		List<String> rt9 = new ArrayList<String>();
		Questao t9 = new Questao("n2 - pergunta9", rt9, "c", 2, 500, 9);
		rt9.add("e");
		rt9.add("e");
		rt9.add("e");
		rt9.add("c");
				
		List<String> rt10 = new ArrayList<String>();
		Questao t10 = new Questao("n2 - pergunta10", rt10, "c", 2, 500, 10);
		rt10.add("c");
		rt10.add("e");
		rt10.add("e");
		rt10.add("e");
		
		
		//perguntas finais
		List<String> rf1 = new ArrayList<String>();
		Questao f1 = new Questao("final - pergunta", rf1, "c", 3, 500, 1);
		rf1.add("e");
		rf1.add("c");
		rf1.add("e");
		rf1.add("e");
				
		List<String> rf2 = new ArrayList<String>();
		Questao f2 = new Questao("final - pergunta2", rf2, "c", 3, 500, 2);
		rf2.add("e");
		rf2.add("e");
		rf2.add("c");
		rf2.add("e");
				
		List<String> rf3 = new ArrayList<String>();
		Questao f3 = new Questao("final - pergunta3", rf3, "c", 3, 500, 3);
		rf3.add("c");
		rf3.add("e");
		rf3.add("e");
		rf3.add("e");
				
		List<String> rf4 = new ArrayList<String>();
		Questao f4 = new Questao("final - pergunta4", rf4, "c", 3, 500, 4);
		rf4.add("e");
		rf4.add("c");
		rf4.add("e");
		rf4.add("e");
				
		List<String> rf5 = new ArrayList<String>();
		Questao f5 = new Questao("final - pergunta5", rf5, "c", 3, 500, 5);
		rf5.add("e");
		rf5.add("e");
		rf5.add("c");
		rf5.add("e");
				
		List<String> rf6 = new ArrayList<String>();
		Questao f6 = new Questao("final - pergunta6", rf6, "c", 3, 500, 6);
		rf6.add("e");
		rf6.add("e");
		rf6.add("e");
		rf6.add("c");
				
		List<String> rf7 = new ArrayList<String>();
		Questao f7 = new Questao("final - pergunta7", rf7, "c", 3, 500, 7);
		rf7.add("e");
		rf7.add("e");
		rf7.add("e");
		rf7.add("c");
				
		List<String> rf8 = new ArrayList<String>();
		Questao f8 = new Questao("final - pergunta8", rf8, "c", 3, 500, 8);
		rf8.add("e");
		rf8.add("e");
		rf8.add("e");
		rf8.add("c");
				
		List<String> rf9 = new ArrayList<String>();
		Questao f9 = new Questao("final - pergunta9", rf9, "c", 3, 500, 9);
		rf9.add("e");
		rf9.add("e");
		rf9.add("e");
		rf9.add("c");
				
		List<String> rf10 = new ArrayList<String>();
		Questao f10 = new Questao("final - pergunta10", rf10, "c", 3, 500, 10);
		rf10.add("c");
		rf10.add("e");
		rf10.add("e");
		rf10.add("e");
		
		//Criando listas p/ embaralhar as questões
		//lista de questões nível 1
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
		
		//lista de questões nível 2
		listaQuestoes2.add(t2);
		listaQuestoes2.add(t3);
		listaQuestoes2.add(t4);
		listaQuestoes2.add(t5);
		listaQuestoes2.add(t6);
		listaQuestoes2.add(t7);
		listaQuestoes2.add(t8);
		listaQuestoes2.add(t9);
		listaQuestoes2.add(t10);
		
		//lista de questões finais
		listaQuestoes3.add(f2);
		listaQuestoes3.add(f3);
		listaQuestoes3.add(f4);
		listaQuestoes3.add(f5);
		listaQuestoes3.add(f6);
		listaQuestoes3.add(f7);
		listaQuestoes3.add(f8);
		listaQuestoes3.add(f9);
		listaQuestoes3.add(f10);
		
		
		//embaralhando a lista de Questões
		Collections.shuffle(listaQuestoes);
		Collections.shuffle(listaQuestoes2);
		Collections.shuffle(listaQuestoes3);
		
		//janelas de perguntas
		new JanelaPerguntas();
		
		//invocando as perguntas p/ o 1º nível - necessário 5 acertos
		while (acertos <= 5) {
			setarCaixa(1);
		}
		
		//fechando a caixa p/ testar o comando de 5 acertos
		if (acertos > 5 && acertos < 10) {
			setarCaixa(2);
		}
		
		if (acertos == 10) {
			setarCaixa(3);
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
	public static void setarCaixa(int nivel) {
		
		if (nivel == 1) {
			Questao questao = listaQuestoes.get(0);
			List <String> respostas = questao.respostas;
			String respostaCorreta = questao.respostaCorreta;
			
			pergunta.setText(questao.pergunta);
			res[0].setText(respostas.get(0));
			res[1].setText(respostas.get(1));
			res[2].setText(respostas.get(2));
			res[3].setText(respostas.get(3));
		}
		
		if (nivel == 2) {
			Questao questao = listaQuestoes2.get(0);
			List <String> respostas = questao.respostas;
			String respostaCorreta = questao.respostaCorreta;
			
			pergunta.setText(questao.pergunta);
			res[0].setText(respostas.get(0));
			res[1].setText(respostas.get(1));
			res[2].setText(respostas.get(2));
			res[3].setText(respostas.get(3));
		}
		
		if (nivel == 3) {
			Questao questao = listaQuestoes3.get(0);
			List <String> respostas = questao.respostas;
			String respostaCorreta = questao.respostaCorreta;
				
			pergunta.setText(questao.pergunta);
			res[0].setText(respostas.get(0));
			res[1].setText(respostas.get(1));
			res[2].setText(respostas.get(2));
			res[3].setText(respostas.get(3));
		}
	}
	
	//além de setar a caixa, remove a questão que foi utilizada, evitando repetição
	public static void setarQuestao(int nivel) {
		
		if (nivel == 1) {
			listaQuestoes.remove(0);
			setarCaixa(1);
		}
		
		if (nivel == 2) {
			listaQuestoes2.remove(0);
			setarCaixa(2);
		}
		
		if (nivel == 3) {
			listaQuestoes3.remove(0);
			pulos.setText("Pergunta Final");
			setarCaixa(3);
		}
	}
	
	
	public String obterRespostaCorreta(Questao questao) {
		return questao.respostaCorreta;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == parar) {
			w1.dispose();
			JOptionPane.showMessageDialog(null, "Você acumulou X reais");
		}
		
		if (e.getSource() == pular) {		
			
			if (nDePulos > 0) {
				//falta inserir o comando para pular
				nDePulos--;
				
				if (acertos <= 5) {
					setarQuestao(1);
					
					if (nDePulos != 1) {
						pulos.setText("Você tem " + nDePulos + " pulos");
					}
					else {
						pulos.setText("Você tem " + nDePulos + " pulo");
					}
				}
				
				if (acertos > 5 && acertos < 10) {
					setarQuestao(2);
					
					if (nDePulos != 1) {
						pulos.setText("Você tem " + nDePulos + " pulos");
					}
					else {
						pulos.setText("Você tem " + nDePulos + " pulo");
					}
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Você não tem mais pulos");
			}
		}
		
		
		//Tratamento de eventos dos botões de resposta
		if (e.getSource() == res[0]) {
			
			if (res[0].getText() == obterRespostaCorreta(listaQuestoes.get(0))) {
				JOptionPane.showMessageDialog(null, "Acertou!");
				
				if (acertos <= 5) {
					setarQuestao(1);
				}
				if (acertos > 5 && acertos < 10) {
					setarQuestao(2);
				}
				if (acertos == 10) {
					setarQuestao(3);
				}
				
				acertos++;
			}
			else {
				w1.dispose();
				JOptionPane.showMessageDialog(null, "Perdeu tudo!");
			}
		}
		
		if (e.getSource() == res[1]) {
			
			if (res[1].getText() == obterRespostaCorreta(listaQuestoes.get(0))) {
				JOptionPane.showMessageDialog(null, "Acertou!");
				
				if (acertos <= 5) {
					setarQuestao(1);
				}
				if (acertos > 5 && acertos < 10) {
					setarQuestao(2);
				}
				if (acertos == 10) {
					setarQuestao(3);
				}
				
				acertos++;
			}
			else {
				w1.dispose();
				JOptionPane.showMessageDialog(null, "Perdeu tudo!");
			}
		}
		
		if (e.getSource() == res[2]) {
			
			if (res[2].getText() == obterRespostaCorreta(listaQuestoes.get(0))) {
				JOptionPane.showMessageDialog(null, "Acertou!");

				if (acertos <= 5) {
					setarQuestao(1);
				}
				if (acertos > 5 && acertos < 10) {
					setarQuestao(2);
				}
				if (acertos == 10) {
					setarQuestao(3);
				}
				
				acertos++;
			}
			else {
				w1.dispose();
				JOptionPane.showMessageDialog(null, "Perdeu tudo!");
			}
		}
		
		if (e.getSource() == res[3]) {
			
			if (res[3].getText() == obterRespostaCorreta(listaQuestoes.get(0))) {
				JOptionPane.showMessageDialog(null, "Acertou!");
				
				if (acertos <= 5) {
					setarQuestao(1);
				}
				if (acertos > 5 && acertos < 10) {
					setarQuestao(2);
				}
				if (acertos == 10) {
					setarQuestao(3);
				}
				
				acertos++;
			}
			else {
				w1.dispose();
				JOptionPane.showMessageDialog(null, "Perdeu tudo!");
			}
		}
		
		
		
		
	}
	
}
	
