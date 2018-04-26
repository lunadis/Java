package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

public class Wind extends JFrame {
	
	
	JToolBar  toolbar = new JToolBar();
	
	JList ltsEstado;
	JScrollPane scrollpane;
	
	
	public Wind() {
		super("Exemplo de interface");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		toolbar.add(new JButton("Abrir"));
		toolbar.add(new JButton("Novo"));
		toolbar.add(new JButton("Salvar"));
		toolbar.add(new JButton("Fechar"));
		
		
		toolbar.setBounds(0, 0, 500, 40);
		pane.add(toolbar);
		
		String estados[] = {"SP","RJ","AM","PA","MG"};
		
		String [] caluna = {"Nome","Cidade","Estado"};
		String [][] dados= {{"Eduardo Jorge", "Salvador", "Bahia"},
				{"Gustavo Neves","Caetité","Bahia" },
				{"Tarcisio Araújo","Mutuípe","Bahia"},
				{"Rafael","Campinas","São Paulo"}};
		
		JTable lisEstados = new JTable(dados, caluna);
		
		JScrollPane srcEstado = new JScrollPane(lisEstados);
		
		srcEstado.setBounds(200, 50, 400, 100);
		pane.add(srcEstado);	
		
		ltsEstado = new JList(estados);
		scrollpane = new JScrollPane(ltsEstado);
		
		scrollpane.setBounds(20, 50, 100, 80);
		pane.add(scrollpane);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(800,600);
	}

	public static void main(String[] args) {
		 
		Wind Jane = new Wind();

	}

}
