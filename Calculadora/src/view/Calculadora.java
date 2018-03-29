package view;

import javax.swing.JFrame;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	JTextField visor = new JTextField();
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	JButton backsp = new JButton("<-");
	
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	
	
	JButton um = new JButton("1");
	JButton dois = new JButton("2");
	JButton tres = new JButton("3");
	JButton quatro = new JButton("4");
	JButton cinco = new JButton("5");
	JButton seis = new JButton("6");
	JButton sete = new JButton("7");
	JButton oito = new JButton("8");
	JButton nove = new JButton("9");
	JButton zero = new JButton("0");
	
	public Calculadora(){
		super("calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		visor.setBounds(20, 20, 240, 50);
		paine.add(visor);
		
		btnMR.setBounds(20, 100, 55,25);
		paine.add(btnMR);
		
		btnMS.setBounds(80, 100, 55,25);
		paine.add(btnMS);

		btnMais.setBounds(140, 100, 55,25);
		paine.add(btnMais);
		
		btnMenos.setBounds(200, 100, 55,25);
		paine.add(btnMenos);
		
		backsp.setBounds(20, 130, 55, 25);
		paine.add(backsp);
		
		btnCE.setBounds(80, 130, 55, 25);
		paine.add(btnCE);
		
		btnC.setBounds(140, 130, 55, 25);
		paine.add(btnC);
		
		
		
		
		
		
		this.setSize(280, 360);
		this.setVisible(true);
		this.setResizable(false);
		
		
	}

	public static void main(String []args) {
		Calculadora calc = new Calculadora();
	}
}
