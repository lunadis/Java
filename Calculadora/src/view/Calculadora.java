package view;

import javax.swing.JFrame;

import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	JTextField visor = new JTextField();
	// primeira fileira de botões
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	
	//segunda fileira de botões
	JButton backsp = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnmom = new JButton("+/-");
	JButton btnraiz = new JButton("Raiz");
	
	//botões da terceira fileira
	JButton btnbarra = new JButton("/");
	JButton btnporc = new JButton("%");
	
	//botões da quarta fileira
	JButton btnmul = new JButton("*");
	JButton btnfra = new JButton("1/x");
	
	//botões da quinta fileira
	JButton btnfmenos = new JButton("-");
	JButton btnfigual = new JButton("=");
	
	//botões da sexta fileira
	JButton btnvirgula = new JButton(",");
	JButton btnfmais = new JButton("+");
	
	//numeros
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
		
		visor.setFont( new Font( "Arial", Font.PLAIN, 20 ));
		visor.setBounds(20, 20, 171, 50);
		paine.add(visor);
		
		//primeira fileira
		btnMC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMC.setMargin(new Insets(1,1,1,1));
		btnMC.setBounds(20, 75, 30,25);
		paine.add(btnMC);
		
		btnMR.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMR.setMargin(new Insets(1,1,1,1));
		btnMR.setBounds(55, 75, 30,25);
		paine.add(btnMR);
		
		btnMS.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMS.setMargin(new Insets(1,1,1,1));
		btnMS.setBounds(90, 75, 30,25);
		paine.add(btnMS);
		
		btnMais.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMais.setMargin(new Insets(1,1,1,1));
		btnMais.setBounds(125, 75, 30,25);
		paine.add(btnMais);
		
		btnMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMenos.setMargin(new Insets(1,1,1,1));
		btnMenos.setBounds(160, 75, 30,25);
		paine.add(btnMenos);
		
		//segunda fileira
		backsp.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		backsp.setMargin(new Insets(1,1,1,1));
		backsp.setBounds(20, 105, 30, 25);
		paine.add(backsp);
		
		btnCE.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnCE.setMargin(new Insets(1,1,1,1));
		btnCE.setBounds(55, 105, 30, 25);
		paine.add(btnCE);
		
		btnC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnC.setMargin(new Insets(1,1,1,1));
		btnC.setBounds(90, 105, 30, 25);
		paine.add(btnC);
		
		
		btnmom.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnmom.setMargin(new Insets(1,1,1,1));
		btnmom.setBounds(125, 105, 30, 25);
		paine.add(btnmom);
		
		btnraiz.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnraiz.setMargin(new Insets(1,1,1,1));
		btnraiz.setBounds(160, 105, 30, 25);
		paine.add(btnraiz);
		
		//terceira fileira
		sete.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		sete.setMargin(new Insets(1,1,1,1));
		sete.setBounds(20, 135, 30, 25);
		paine.add(sete);
		
		
		oito.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		oito.setMargin(new Insets(1,1,1,1));
		oito.setBounds(55, 135, 30, 25);
		paine.add(oito);
		
		nove.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		nove.setMargin(new Insets(1,1,1,1));
		nove.setBounds(90, 135, 30, 25);
		paine.add(nove);
		
		btnbarra.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnbarra.setMargin(new Insets(1,1,1,1));
		btnbarra.setBounds(125, 135, 30, 25);
		paine.add(btnbarra);
		
		btnporc.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnporc.setMargin(new Insets(1,1,1,1));
		btnporc.setBounds(160, 135, 30, 25);
		paine.add(btnporc);
		
		//quarta fileira
		quatro.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		quatro.setMargin(new Insets(1,1,1,1));
		quatro.setBounds(20, 165, 30, 25);
		paine.add(quatro);
		
		cinco.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		cinco.setMargin(new Insets(1,1,1,1));
		cinco.setBounds(55, 165, 30, 25);
		paine.add(cinco);
		
		seis.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		seis.setMargin(new Insets(1,1,1,1));
		seis.setBounds(90, 165, 30, 25);
		paine.add(seis);
		
		btnmul.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnmul.setMargin(new Insets(1,1,1,1));
		btnmul.setBounds(125, 165, 30, 25);
		paine.add(btnmul);
		
		btnfra.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnfra.setMargin(new Insets(1,1,1,1));
		btnfra.setBounds(160, 165, 30, 25);
		paine.add(btnfra);
		
		//quinta fileira
		
		um.setFont(new Font("Arial", Font.PLAIN, 12));
		um.setMargin(new Insets(1,1,1,1));
		um.setBounds(20, 195, 30, 25);
		paine.add(um);
		
		dois.setFont(new Font("Arial", Font.PLAIN, 12));
		dois.setMargin(new Insets(1,1,1,1));
		dois.setBounds(55, 195, 30, 25);
		paine.add(dois);
		
		tres.setFont(new Font("Arial", Font.PLAIN, 12));
		tres.setMargin(new Insets(1,1,1,1));
		tres.setBounds(90, 195, 30, 25);
		paine.add(tres);
		
		btnfmenos.setFont(new Font("Arial", Font.PLAIN, 12));
		btnfmenos.setMargin(new Insets(1,1,1,1));
		btnfmenos.setBounds(125, 195, 30, 25);
		paine.add(btnfmenos);
		
		btnfigual.setFont(new Font("Arial", Font.PLAIN, 12));
		btnfigual.setMargin(new Insets(1,1,1,1));
		btnfigual.setBounds(160, 195, 30, 55);
		paine.add(btnfigual);
		
		//sexta fileira
		zero.setFont(new Font("Arial", Font.PLAIN, 12));
		zero.setMargin(new Insets(1,1,1,1));
		zero.setBounds(20, 225, 65, 25);
		paine.add(zero);
		
		btnvirgula.setFont(new Font("Arial", Font.PLAIN, 12));
		btnvirgula.setMargin(new Insets(1,1,1,1));
		btnvirgula.setBounds(90, 225, 30, 25);
		paine.add(btnvirgula);
		
		btnfmais.setFont(new Font("Arial", Font.PLAIN, 12));
		btnfmais.setMargin(new Insets(1,1,1,1));
		btnfmais.setBounds(125, 225, 30, 25);
		paine.add(btnfmais);
			
		
		this.setSize(228, 322);
		this.setVisible(true);
		this.setResizable(true);
		
		
	}

	public static void main(String []args) {
		Calculadora calc = new Calculadora();
	}
}
