package showmilhao.poo.ufba;


import java.awt.*;
import javax.swing.*;



public class Janela_Perguntas {

	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	JLabel	pergunta;
	JButton res[] = new JButton[4];
	JButton parar[] = new JButton[1];
	
	JFrame w1;
	JProgressBar b;
	
	public static void main(String[] args) {
		
		new Janela_Perguntas();
	}
	
	public Janela_Perguntas(){
		w1 = new JFrame();
		w1.setSize(400,400);
		w1.setLocation((int)(dim.getWidth()-400)/2,(int)(dim.getHeight()-300)/2);
		w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w1.setVisible(true);
		w1.setLayout(null);
		
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
		
		parar[0] = new JButton("PARAR");
		parar[0].setBounds(232, 310,120, 40);
		w1.add(parar[0]);
		
		pergunta = new JLabel("Perguntas aqui:");
		pergunta.setBounds(52,15,300,40);
		w1.add(pergunta);
	}
}
