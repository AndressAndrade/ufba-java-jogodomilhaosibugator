package showmilhao.poo.ufba;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class JanelaPerguntas implements ActionListener  {

	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	static  JLabel	pergunta;
	static  JButton res[] = new JButton[4];
	JButton parar = new JButton();
	JButton  pular;
	
	static  JLabel  acertar;
	static  JLabel  acumular;
	static  JLabel  pulos;
	
	static  JFrame  w1;
	
	static  int nDePulos = 3;
	static  int dinheiro = 0;
	static  int acumulado = 0;
	
	static int acertos = 1;
	static int acertos2 = 1;
	static int acertos3 = 1;
	
	static String certo;
	
	static File comeco = new File("sibugator.wav");
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
<<<<<<< HEAD
				
		//um molde de 10 perguntas aleatï¿½rias -> falta inserir os dados
		
		//perguntas nï¿½vel 1
		/*
		List<String> rq1 = new ArrayList<String>();
		Questao q1 = new Questao("n1 - Qual era a cor do cavalo branco de Napoleï¿½o?", rq1, "azul", 1, 1000, 1);
		rq1.add("branco");
		rq1.add("azul");
		rq1.add("amarelo");
		rq1.add("preto");
		*/
=======
		JOptionPane.showMessageDialog(null, "Clique no OK para comecar o jogo", "Bem-vindo ao Show do Milhao", JOptionPane.INFORMATION_MESSAGE);
		Audio.tocarSom(comeco, 5600);
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
		
		//janelas de perguntas
		
		Questionario.readQuestionario();
		new JanelaPerguntas();
		
<<<<<<< HEAD
		//invocando as perguntas p/ o 1ï¿½ nï¿½vel - necessï¿½rio 5 acertos
=======
		//invocando as perguntas p/ o 1Âº nivel - necessario 5 acertos
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
		if (acertos < 5) {
			setarCaixa(1);
		}
		
		//fechando a caixa p/ testar o comando de 5 acertos
		if (acertos >= 5 && acertos < 10) {
			setarCaixa(2);
		}
		
		if (acertos >= 10 && acertos < 15) {
			setarCaixa(3);
		}
		
		if (acertos == 15) {
			setarCaixa(4);
		}

	}
	
	public JanelaPerguntas(){
		w1 = new JFrame();
		w1.setResizable(false);
		w1.setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaPerguntas.class.getResource("/showmilhao/poo/ufba/game_pad.png")));
		w1.setTitle("Show do Milh\u00E3o Sibulgator");
		w1.setSize(420,450);
		w1.setLocation((int)(dim.getWidth()-420)/2,(int)(dim.getHeight()-450)/2);
		w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w1.setVisible(true);
		w1.getContentPane().setLayout(null);
		
		pergunta = new JLabel("Perguntas aqui:");
		pergunta.setBounds(52,15,300,50);
		w1.getContentPane().add(pergunta);
		
		res[0] = new JButton("	");
		res[0].setBounds(52,80,300,40);
		w1.getContentPane().add(res[0]);
		
		res[1] = new JButton("	");
		res[1].setBounds(52,140,300,40);
		w1.getContentPane().add(res[1]);
		
		res[2] = new JButton("	");
		res[2].setBounds(52,200,300, 40);
		w1.getContentPane().add(res[2]);
		
		res[3] = new JButton("	");
		res[3].setBounds(52, 260,300, 40);
		w1.getContentPane().add(res[3]);
		
		parar = new JButton("PARAR");
		parar.setBounds(272, 340,80, 40);
		w1.getContentPane().add(parar);
		
		pular = new JButton("PULAR");
		pular.setBounds(172, 340, 80, 40);
		w1.getContentPane().add(pular);
		
		acertar = new JLabel("Acerto: R$:1000,00");
		acertar.setBounds(12,320,150,40);
		w1.getContentPane().add(acertar);
		
		acumular = new JLabel("Acumulado: R$:" + dinheiro + ",00");
		acumular.setBounds(12,350,180,40);
		w1.getContentPane().add(acumular);
		
<<<<<<< HEAD
		pulos = new JLabel ("Vocï¿½ tem 3 pulos"); 
=======
		pulos = new JLabel ("Voce tem 3 pulos"); 
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
		pulos.setBounds(12,380,150,40);
		w1.getContentPane().add(pulos);
		
		parar.addActionListener(this);
		pular.addActionListener(this);
		res[0].addActionListener(this);
		res[1].addActionListener(this);
		res[2].addActionListener(this);
		res[3].addActionListener(this);
	}

	
	public static Questao setQuestaoByNivel (int nivel) {
		Questao questao = new Questao(null, null, null, null, null, null, null, null, null);
	
		if (nivel == 1) {
			questao = Questionario.listaQuestoes.get(0);
		}
		if (nivel == 2) {
			questao = Questionario.listaQuestoes2.get(0);
		}
		if (nivel == 3) {
			questao = Questionario.listaQuestoes3.get(0);
		}
		if (nivel == 4) {
			questao = Questionario.listaQuestoes4.get(0);
		}
		
		certo = questao.respostaCorreta;
		return questao;
	}
	
	
<<<<<<< HEAD
		//funï¿½ï¿½o para setar as perguntas na JanelaPerguntas
=======
		//funcao para setar as perguntas na JanelaPerguntas
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
		public static void setarCaixa(int nivel) {
			
			Questao questao = setQuestaoByNivel(nivel); 
			
			pergunta.setText("<html> " + questao.pergunta + " </html>");
			res[0].setText(questao.resposta1);
			res[1].setText(questao.resposta2);
			res[2].setText(questao.resposta3);
			res[3].setText(questao.resposta4);
			
			//Teste
			System.out.println(questao.respostaCorreta +  "      " + questao.nivel);
				
		}
		public static void removerQuestao (int nivel) {
			
<<<<<<< HEAD
		//novo mï¿½todo auxiliar
=======
		//novo metodo auxiliar
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
			
			if (nivel == 1) {
				Questionario.listaQuestoes.remove(0);
			}
			
			if (nivel == 2) {
				Questionario.listaQuestoes2.remove(0);
			}
			
			if (nivel == 3) {
				Questionario.listaQuestoes3.remove(0);
			}
			
			if (nivel == 4) {
				Questionario.listaQuestoes4.remove(0);
				pulos.setText("Pergunta Final");
			}
		}
		
<<<<<<< HEAD
		//alï¿½m de setar a caixa, remove a questï¿½o que foi utilizada, evitando repetiï¿½ï¿½o
=======
		//alem de setar a caixa, remove a questao que foi utilizada, evitando repeticao
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
		public static void setarQuestao(int nivel) {
			removerQuestao(nivel);
			setarCaixa(nivel);
		}
		
		
<<<<<<< HEAD
		//Mï¿½todos criados para otimizar eventos nos botï¿½es de resposta
		public static void acertarPergunta() {
			JOptionPane.showMessageDialog(null, "Acertou", "Parabï¿½ns!", JOptionPane.INFORMATION_MESSAGE);
=======
		//Metodos criados para otimizar eventos nos botoes de resposta
		public static void acertarPergunta() throws IOException, InterruptedException {
			File acertou = new File("acertou.wav");
			Audio.tocarSom(acertou, 1800);
			
			JOptionPane.showMessageDialog(null, "Acertou", "Parabens!", JOptionPane.INFORMATION_MESSAGE);
			
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
			
			if (acertos < 5) {
				setarQuestao(1);
				int dinheiro = acertos * 1000;
				acumular.setText("Acumulado: R$" + dinheiro + ",00");
				Questao questao = Questionario.listaQuestoes.get(0);
				String valor = questao.getValor();
				acertar.setText("Acerto: R$:"+ valor + ",00");
			}
			if (acertos >= 5 && acertos < 10) {
				setarQuestao(2);
				Questao questao = Questionario.listaQuestoes2.get(0);
				String valor = questao.getValor();
				acertar.setText("Acerto: R$:"+ valor + ",00");
				
				if (acertos == 5) {
					acumular.setText("Acumulado: R$:5000,00");
				}
				
				else {
					int dinheiro = acertos2 * 10000;
					acumular.setText("Acumulado: R$" + dinheiro + ",00");
					acertos2++;
				}

				
			}
			if (acertos >= 10 && acertos < 15) {
				setarQuestao(3);
				Questao questao = Questionario.listaQuestoes3.get(0);
				String valor = questao.getValor();
				acertar.setText("Acerto: R$:"+ valor + ",00");
				
				if (acertos == 10) {
					acumular.setText("Acumulado: R$:50000,00");
				}
				
				else {
					int dinheiro = acertos3 * 100000;
					acumular.setText("Acumulado: R$" + dinheiro + ",00");
					acertos3++;
				}
			}
			if (acertos == 15) {
				setarQuestao(4);
<<<<<<< HEAD
				acertar.setText("Milhï¿½o: R$:1.000.000,00");
=======
				acertar.setText("Milhao: R$:1.000.000,00");
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
				acumular.setText("Acumulado: R$: 500.000,00");
			}
			
			if (acertos == 16) {
<<<<<<< HEAD
				w1.dispose();
				JOptionPane.showMessageDialog(null, "Parabï¿½ns! Vocï¿½ venceu o Jogo do Milhï¿½o Sibugator\n" 
						+ "e ganhou um prï¿½mio de R$:1.000.000,00 !!!","Vocï¿½ joga muito!", JOptionPane.INFORMATION_MESSAGE);
=======
				Audio ganhou = new Audio();
				ganhou.audioid = 1;
				Thread threadMusica2 = new Thread(ganhou);
			    threadMusica2.start();
		
				JOptionPane.showMessageDialog(null, "Voce tem certeza?\n" 
						+ "","", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Voce tem certeza MESMO?\n" 
						+ "","", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "POP UP!\n" 
						+ "","", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "NAO FOI DESSA VEZ\n" 
						+ "","", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Voce foi DIBRADO\n" 
						+ "","", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Voce tem persistencia?\n" 
						+ "","", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Ich liebe dich nicht\n" 
						+ "","", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "ERROU\n" 
						+ "","", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "HUEUHEHUEUHEUHEHUE\n" 
						+ "","", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "BRBRBRBRBRBRBR\n" 
						+ "","", JOptionPane.INFORMATION_MESSAGE);	
				JOptionPane.showMessageDialog(null, "Voce acaba de doar tudo a fundacao Bill Gates\n" 
						+ "e sua pesquisa a vacas com odor humano!","", JOptionPane.INFORMATION_MESSAGE);		
				JOptionPane.showMessageDialog(null, "Parabens! Voce venceu o Jogo do Milhao Sibugator\n" 
						+ "e ganhou um premio de R$:1.000.000,00 !!!","Voce joga muito!", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Caiu no conto do vigario, perdeu tudo ao clicar\n" 
						+ "em OK! Fim do programa.","", JOptionPane.INFORMATION_MESSAGE);
				final ImageIcon ganhouimage = new ImageIcon("ganhou.jpg");
				JOptionPane.showMessageDialog(null, "Você é fera, bicho", "YOU WON", JOptionPane.INFORMATION_MESSAGE, ganhouimage);
				
				w1.dispose();		
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
					
			}
			
			acertos++;
		}
		
<<<<<<< HEAD
		public static void errarPergunta() {
			//w1.dispose();
=======
		public static void errarPergunta() throws IOException, InterruptedException {
			
			//novo código:
			File errou = new File("errou.wav");
			Audio.tocarSom(errou, 1800);
			
			// 
			
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
			if (acertos <= 6) {
				
				acumulado = (acertos -1) * 1000;
				acumulado /= 2;
<<<<<<< HEAD
				JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
				w1.dispose();
=======
				JOptionPane.showMessageDialog(null, "Voce errou. Voce leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
			}
			
			
			if (acertos > 6 && acertos <= 11) {

				acumulado = (acertos2 -1) * 10000;
				acumulado /= 2;
				if (acertos == 11) {
<<<<<<< HEAD
					JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:25000,00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
=======
					JOptionPane.showMessageDialog(null, "Voce errou. Voce leva R$:25000,00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Voce errou. Voce leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
				}
			}
			
			if (acertos > 11 && acertos <= 16) {
				acumulado = (acertos3 -1) * 100000;
				acumulado /= 2;
				if (acertos == 16) {
<<<<<<< HEAD
					JOptionPane.showMessageDialog(null, "Vocï¿½ perdeu tudo.","GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
=======
					final ImageIcon fausto = new ImageIcon("darkfausto.jpg");
					Audio perdeu = new Audio();
					perdeu.audioid = 0;
					JOptionPane.showMessageDialog(null, "Voce perdeu tudo.","GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
					Thread threadMusica = new Thread(perdeu);
				    threadMusica.start();
					JOptionPane.showMessageDialog(null, " ", "GAME OVER", JOptionPane.INFORMATION_MESSAGE, fausto);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Voce errou. Voce leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
				}
			}	
			
			w1.dispose();
		}
		
		
		public void setarBackground() {
			for (int i = 0; i < 4; i++) {
				if (res[i].getText().equals(certo)) {
					res[i].setBackground(Color.GREEN);
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
				}
			}
		}
		
		public void resetarBackground() {
			for (int i = 0; i < 4; i++) {
				res[i].setBackground(null);
			}
		}
		
		public void actionPerformed(ActionEvent e) {
			
<<<<<<< HEAD
			//Tratamento de evento nos botï¿½es de resposta
			
			if (e.getSource() == res[0]) {
				if (res[0].getText().equals(certo)) {
					acertarPergunta();
=======
			//Tratamento de evento nos botoes de resposta
			for (int i = 0; i < 4; i++)
				{ 
				if (e.getSource() == res[i]) {
					
					try {
						setarBackground();
						
						if (res[i].getText().equals(certo)) {
							acertarPergunta();
							resetarBackground();
						}
						
						else {
							res[i].setBackground(Color.RED);
							errarPergunta();
						}
					} catch (IOException | InterruptedException e1) {
						e1.printStackTrace();
					}
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
				}
			}
				

			
			/*if (e.getSource() == res[0]) {
				try {
					if (res[0].getText().equals(certo)) {
						acertarPergunta();
					}
					
					else {
						errarPergunta();
					}
				} catch (IOException | InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		
			
			if (e.getSource() == res[1]) {
				try {
					if (res[1].getText().equals(certo)) {
						acertarPergunta();
					}
					
					else {
						errarPergunta();
					}
				} catch (IOException | InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			
			
			if (e.getSource() == res[2]) {
				try {
					if (res[2].getText().equals(certo)) {
						acertarPergunta();
					}
					
					else {
						errarPergunta();
					}
				} catch (IOException | InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			
			
			if (e.getSource() == res[3]) {
				try {
					if (res[3].getText().equals(certo)) {
						acertarPergunta();
					}
					
					else {
						errarPergunta();
					}
				} catch (IOException | InterruptedException e1) {
					e1.printStackTrace();
				}
			} */
			
			
<<<<<<< HEAD
			//Tratamento de evento do botï¿½o parar
=======
			//Tratamento de evento do botÃ£o parar
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
			if (e.getSource() == parar) {
				//w1.dispose();
				if (acertos <= 6) {
					
					acumulado = (acertos -1) * 1000;
<<<<<<< HEAD
					JOptionPane.showMessageDialog(null, "Vocï¿½ acumulou R$:" + acumulado + ",00","Tente de novo!", JOptionPane.INFORMATION_MESSAGE);
=======
					JOptionPane.showMessageDialog(null, "Voce acumulou R$:" + acumulado + ",00","Tente de novo!", JOptionPane.INFORMATION_MESSAGE);
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
				}
				
				if (acertos > 6 && acertos <= 11) {

					acumulado = (acertos2 -1) * 10000;
					if (acertos == 11) {
<<<<<<< HEAD
						JOptionPane.showMessageDialog(null, "Vocï¿½ acumulou R$:50000,00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Vocï¿½ acumulou R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
=======
						JOptionPane.showMessageDialog(null, "Voce acumulou R$:50000,00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Voce acumulou R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
					}
				}
				
				if (acertos > 11 && acertos <= 16) {
					acumulado = (acertos3 -1) * 100000;
					if (acertos == 16) {
<<<<<<< HEAD
						JOptionPane.showMessageDialog(null, "Vocï¿½ acumulou R$:500.000,00","Muito bem!", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Vocï¿½ acumulou R$:" + acumulado + ",00","Muito bem!", JOptionPane.INFORMATION_MESSAGE);
=======
						JOptionPane.showMessageDialog(null, "Voce acumulou R$:500.000,00","Muito bem!", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Voce acumulou R$:" + acumulado + ",00","Muito bem!", JOptionPane.INFORMATION_MESSAGE);
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
					}
				}
			
				w1.dispose();
			}
			
<<<<<<< HEAD
			//Tratamento de evento do botï¿½o pular
			if (e.getSource() == pular) {		
				
				if (nDePulos > 0) {
					nDePulos--;
					
					if (acertos < 5) {
						setarQuestao(1);
						
						if (nDePulos != 1) {
							pulos.setText("Vocï¿½ tem " + nDePulos + " pulos");
						}
						else {
							pulos.setText("Vocï¿½ tem " + nDePulos + " pulo");
						}
					}
					
					if (acertos >= 5 && acertos < 10) {
						setarQuestao(2);
						
						if (nDePulos != 1) {
							pulos.setText("Vocï¿½ tem " + nDePulos + " pulos");
						}
						else {
							pulos.setText("Vocï¿½ tem " + nDePulos + " pulo");
						}
					}
					if (acertos >= 10 && acertos < 15) {
						setarQuestao(3);
						
						if (nDePulos != 1) {
							pulos.setText("Vocï¿½ tem " + nDePulos + " pulos");
						}
						else {
							pulos.setText("Vocï¿½ tem " + nDePulos + " pulo");
						}
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Vocï¿½ nï¿½o tem mais pulos","Sem recursos!", JOptionPane.INFORMATION_MESSAGE);
				}
=======
			
			//Tratamento de evento do botao pular
			if (e.getSource() == pular) {
				setarPulo();
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
			}
			
		}
			
<<<<<<< HEAD
			//Tratamento de eventos dos botï¿½es de resposta
			/*
			if (e.getSource() == res[0]) {
				
				if (res[0].getText().equals(certo)) {
					
					JOptionPane.showMessageDialog(null, "Acertou", "Parabï¿½ns!", JOptionPane.INFORMATION_MESSAGE);
					
					if (acertos < 5) {
						setarQuestao(1);
						int dinheiro = acertos * 1000;
						acumular.setText("Acumulado: R$" + dinheiro + ",00");
						Questao questao = Questionario.listaQuestoes.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
					}
					if (acertos >= 5 && acertos < 10) {
						setarQuestao(2);
						Questao questao = Questionario.listaQuestoes2.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
						
						if (acertos == 5) {
							acumular.setText("Acumulado: R$:5000,00");
						}
						
						else {
							int dinheiro = acertos2 * 10000;
							acumular.setText("Acumulado: R$" + dinheiro + ",00");
							acertos2++;
						}
		
						
					}
					if (acertos >= 10 && acertos < 15) {
						setarQuestao(3);
						Questao questao = Questionario.listaQuestoes3.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
						
						if (acertos == 10) {
							acumular.setText("Acumulado: R$:50000,00");
						}
						
						else {
							int dinheiro = acertos3 * 100000;
							acumular.setText("Acumulado: R$" + dinheiro + ",00");
							acertos3++;
						}
					}
					if (acertos == 15) {
						setarQuestao(4);
						acertar.setText("Milhï¿½o: R$:1.000.000,00");
						acumular.setText("Acumulado: R$: 500.000,00");
					}
					
					if (acertos == 16) {
						w1.dispose();
						JOptionPane.showMessageDialog(null, "Parabï¿½ns! Vocï¿½ venceu o Jogo do Milhï¿½o Sibugator\n" 
								+ "e ganhou um prï¿½mio de R$:1.000.000,00 !!!","Vocï¿½ joga muito!", JOptionPane.INFORMATION_MESSAGE);
							
					}
					
					acertos++;
				}
				else {
					w1.dispose();
					if (acertos <= 6) {
						
						acumulado = (acertos -1) * 1000;
						acumulado /= 2;
						JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
					}
					
					if (acertos > 6 && acertos <= 11) {

						acumulado = (acertos2 -1) * 10000;
						acumulado /= 2;
						if (acertos == 11) {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:25000,00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					
					if (acertos > 11 && acertos <= 16) {
						acumulado = (acertos3 -1) * 100000;
						acumulado /= 2;
						if (acertos == 16) {
							JOptionPane.showMessageDialog(null, "Vocï¿½ perdeu tudo.","GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}
			}
			
			if (e.getSource() == res[1]) {
				
				if (res[1].getText().equals(certo)) {
				
					JOptionPane.showMessageDialog(null, "Acertou", "Parabï¿½ns!", JOptionPane.INFORMATION_MESSAGE);
					
					if (acertos < 5) {
						setarQuestao(1);
						int dinheiro = acertos * 1000;
						acumular.setText("Acumulado: R$" + dinheiro + ",00");
						Questao questao = Questionario.listaQuestoes.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
					}
					if (acertos >= 5 && acertos < 10) {
						setarQuestao(2);
						Questao questao = Questionario.listaQuestoes2.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
						
						if (acertos == 5) {
							acumular.setText("Acumulado: R$:5000,00");
						}
						
						else {
							int dinheiro = acertos2 * 10000;
							acumular.setText("Acumulado: R$" + dinheiro + ",00");
							acertos2++;
						}
					}
					if (acertos >= 10 && acertos < 15) {
						setarQuestao(3);
						Questao questao = Questionario.listaQuestoes3.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
						
						if (acertos == 10) {
							acumular.setText("Acumulado: R$:50000,00");
						}
						
						else {
							int dinheiro = acertos3 * 100000;
							acumular.setText("Acumulado: R$" + dinheiro + ",00");
							acertos3++;
						}
					}
					if (acertos == 15) {
						setarQuestao(4);
						acertar.setText("Milhï¿½o: R$:1.000.000,00");
						acumular.setText("Acumulado: R$: 500.000,00");
					}
					
					if (acertos == 16) {
						w1.dispose();
						JOptionPane.showMessageDialog(null, "Parabï¿½ns! Vocï¿½ venceu o Jogo do Milhï¿½o Sibugator\n" 
								+ "e ganhou um prï¿½mio de R$:1.000.000,00 !!!","Vocï¿½ joga muito!", JOptionPane.INFORMATION_MESSAGE);
							
					}
					
					acertos++;
				}
				else {
					w1.dispose();
					if (acertos <= 6) {
						
						acumulado = (acertos -1) * 1000;
						acumulado /= 2;
						JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
					}
					
					if (acertos > 6 && acertos <= 11) {

						acumulado = (acertos2 -1) * 10000;
						acumulado /= 2;
						if (acertos == 11) {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:25000,00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					
					if (acertos > 11 && acertos <= 16) {
						acumulado = (acertos3 -1) * 100000;
						acumulado /= 2;
						if (acertos == 16) {
							JOptionPane.showMessageDialog(null, "Vocï¿½ perdeu tudo.","GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
					}
=======
			public static boolean validarPulo() {
				if (nDePulos > 0 && acertos < 15) {
					return true;
				}
				else {
					return false;
				}
			}
					
			public static void pularQuestao() {
				if (acertos < 5) {
					setarQuestao(1);
				}
				if (acertos >= 5 && acertos < 10) {
					setarQuestao(2);
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
				}
				if (acertos >= 10 && acertos < 15) {
					setarQuestao(3);
				}
				nDePulos--;
			}
				
<<<<<<< HEAD
				if (res[2].getText().equals(certo)) {
					
					JOptionPane.showMessageDialog(null, "Acertou", "Parabï¿½ns!", JOptionPane.INFORMATION_MESSAGE);

					if (acertos < 5) {
						setarQuestao(1);
						int dinheiro = acertos * 1000;
						acumular.setText("Acumulado: R$" + dinheiro + ",00");
						Questao questao = Questionario.listaQuestoes.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
					}
					if (acertos >= 5 && acertos < 10) {
						setarQuestao(2);
						Questao questao = Questionario.listaQuestoes2.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
						
						if (acertos == 5) {
							acumular.setText("Acumulado: R$:5000,00");
						}
						
						else {
							int dinheiro = acertos2 * 10000;
							acumular.setText("Acumulado: R$" + dinheiro + ",00");
							acertos2++;
						}
					}
					if (acertos >= 10 && acertos < 15) {
						setarQuestao(3);
						Questao questao = Questionario.listaQuestoes3.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
						
						if (acertos == 10) {
							acumular.setText("Acumulado: R$:50000,00");
						}
						
						else {
							int dinheiro = acertos3 * 100000;
							acumular.setText("Acumulado: R$" + dinheiro + ",00");
							acertos3++;
						}
					}
					if (acertos == 15) {
						setarQuestao(4);
						acertar.setText("Milhï¿½o: R$:1.000.000,00");
						acumular.setText("Acumulado: R$: 500.000,00");
					}
					
					if (acertos == 16) {
						w1.dispose();
						JOptionPane.showMessageDialog(null, "Parabï¿½ns! Vocï¿½ venceu o Jogo do Milhï¿½o Sibugator\n" 
								+ "e ganhou um prï¿½mio de R$:1.000.000,00 !!!","Vocï¿½ joga muito!", JOptionPane.INFORMATION_MESSAGE);
							
=======
			public void setarPulo() {
				if (validarPulo()) {
					pularQuestao();
					if (nDePulos != 1) {
						pulos.setText("Voce tem " + nDePulos + " pulos");
					}
					else {
						pulos.setText("Voce tem " + nDePulos + " pulo");
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
					}
				}
				else {
<<<<<<< HEAD
					w1.dispose();
					if (acertos <= 6) {
						
						acumulado = (acertos -1) * 1000;
						acumulado /= 2;
						JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
					}
					
					if (acertos > 6 && acertos <= 11) {

						acumulado = (acertos2 -1) * 10000;
						acumulado /= 2;
						if (acertos == 11) {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:25000,00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					
					if (acertos > 11 && acertos <= 16) {
						acumulado = (acertos3 -1) * 100000;
						acumulado /= 2;
						if (acertos == 16) {
							JOptionPane.showMessageDialog(null, "Vocï¿½ perdeu tudo.","GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					
				}
			}
			
			if (e.getSource() == res[3]) {
				
				if (res[3].getText().equals(certo)) {
		
					JOptionPane.showMessageDialog(null, "Acertou", "Parabï¿½ns!", JOptionPane.INFORMATION_MESSAGE);
					
					if (acertos < 5) {
						setarQuestao(1);
						int dinheiro = acertos * 1000;
						acumular.setText("Acumulado: R$" + dinheiro + ",00");
						Questao questao = Questionario.listaQuestoes.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
					}
					if (acertos >= 5 && acertos < 10) {
						setarQuestao(2);
						Questao questao = Questionario.listaQuestoes2.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
						
						if (acertos == 5) {
							acumular.setText("Acumulado: R$:5000,00");
						}
						
						else {
							int dinheiro = acertos2 * 10000;
							acumular.setText("Acumulado: R$" + dinheiro + ",00");
							acertos2++;
						}
					}
					if (acertos >= 10 && acertos < 15) {
						setarQuestao(3);
						Questao questao = Questionario.listaQuestoes3.get(0);
						String valor = questao.getValor();
						acertar.setText("Acerto: R$:"+ valor + ",00");
						
						if (acertos == 10) {
							acumular.setText("Acumulado: R$:50000,00");
						}
						
						else {
							int dinheiro = acertos3 * 100000;
							acumular.setText("Acumulado: R$" + dinheiro + ",00");
							acertos3++;
						}
					}
					if (acertos == 15) {
						setarQuestao(4);
						acertar.setText("Milhï¿½o: R$:1.000.000,00");
						acumular.setText("Acumulado: R$: 500.000,00");
					}
					
					if (acertos == 16) {
						w1.dispose();
						JOptionPane.showMessageDialog(null, "Parabï¿½ns! Vocï¿½ venceu o Jogo do Milhï¿½o Sibugator\n" 
								+ "e ganhou um prï¿½mio de R$:1.000.000,00 !!!","Vocï¿½ joga muito!", JOptionPane.INFORMATION_MESSAGE);
							
					}
					
					acertos++;
				}
				else {
					w1.dispose();
					if (acertos <= 6) {
						
						acumulado = (acertos -1) * 1000;
						acumulado /= 2;
						JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
					}
					
					if (acertos > 6 && acertos <= 11) {

						acumulado = (acertos2 -1) * 10000;
						acumulado /= 2;
						if (acertos == 11) {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:25000,00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					
					if (acertos > 11 && acertos <= 16) {
						acumulado = (acertos3 -1) * 100000;
						acumulado /= 2;
						if (acertos == 16) {
							JOptionPane.showMessageDialog(null, "Vocï¿½ perdeu tudo.","GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Vocï¿½ errou. Vocï¿½ leva R$:" + acumulado + ",00","Bom Jogo!", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				} 
			} */
			
				
		}
=======
					JOptionPane.showMessageDialog(null, "Voce nao tem mais pulos","Sem recursos!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
>>>>>>> 4e26e289b8b790d61ea52337aa8ab69d2ebbd6a5
		
	}

	
