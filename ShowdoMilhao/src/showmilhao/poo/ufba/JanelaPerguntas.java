package showmilhao.poo.ufba;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPerguntas implements ActionListener {

	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	JLabel	pergunta;
	JButton res[] = new JButton[4];
	JButton parar = new JButton();
	JLabel  acertar;
	JLabel  errar;
	
	JFrame w1;
	
	
	public static void main(String[] args) {
		
		new JanelaPerguntas();
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
		
		acertar = new JLabel("Acertar: X reais");
		acertar.setBounds(52,320,150,40);
		w1.add(acertar);
		
		errar = new JLabel("Errar: X reais");
		errar.setBounds(52,350,150,40);
		w1.add(errar);
		
		parar.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == parar) {
			w1.dispose();
			JOptionPane.showMessageDialog(null, "Você acumulou X reais");
		}
		
	}
	
}
	
