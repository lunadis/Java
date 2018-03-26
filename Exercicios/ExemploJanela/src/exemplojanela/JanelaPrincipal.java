package exemplojanela;

import java.awt.Container;
import javax.swing.JFrame; // classe que detem os metodos de criação de janela
import javax.swing.JLabel; // classe que detem os metodos de escrita em janela
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class JanelaPrincipal extends JFrame {
	
	JLabel lblDesc = new JLabel("Preencha os Campos e Clique em Gravar Dados");
	JLabel lblNome = new JLabel("Nome: "); // Criar escritas dentro da janela
	JLabel lblEnde = new JLabel("Endereço: ");
	JLabel lblBairro = new JLabel("Bairro: ");
	JLabel lblEstado = new JLabel("Estado: ");
	JLabel lblTelefone = new JLabel("Telefone: ");
	JLabel lblCelular = new JLabel("Celular: ");
	JLabel lblEmail = new JLabel("Email: ");
	
	JTextField txtNome = new JTextField(); // creia uma caixa de texto
	JTextField txtEnde = new JTextField();
	JTextField txtBairro = new JTextField();
	JTextField txtEstado = new JTextField();
	JTextField txtTelefone = new JTextField();
	JTextField txtCelular = new JTextField();
	JTextField txtEmail = new JTextField();
	
	JComboBox Estado = new JComboBox();
	
	private final JLabel lblEnviar = new JLabel("Enviarl");
	
	
	
	public JanelaPrincipal () { // constutor: necessário para herdar as metodos de uma classe pai.
		super("Cadastro de Clientes");
		
		Container paine = this.getContentPane(); // classe qu eposiciona objetos/elementos na tela;
		paine.setLayout(null); // define o layout da tela como "nenhum";
		
		lblDesc.setBounds(20, 20, 400, 25); // .setBounds (eixo horixontal, eixo vertical, tamano horizontal, tamanho vertical); Determina o tamanho
		paine.add(lblDesc); // adiciona na janela
		
		lblNome.setBounds(20,50,40,25);
		paine.add(lblNome);
		txtNome.setBounds(100, 50, 200, 25);
		paine.add(txtNome);
		
		lblEnde.setBounds(20, 80, 200, 25);
		paine.add(lblEnde);
		txtEnde.setBounds(100, 80, 200, 25);
		paine.add(txtEnde);
		
		lblBairro.setBounds(20, 110, 200, 25);
		paine.add(lblBairro);
		txtBairro.setBounds(100, 110, 200, 25);
		paine.add(txtBairro);
		
		lblEstado.setBounds(20, 140, 200, 25);
		paine.add(lblEstado);
		Estado.addItem("SP");
		Estado.addItem("Santa Catarina");
		Estado.addItem("Parana");
		Estado.addItem("São Paulo");
		Estado.addItem("Rio deo Janeiro");
		Estado.setBounds(100, 140, 200, 25);
		paine.add(Estado);
		
		lblTelefone.setBounds(20, 170, 150, 25);
		paine.add(lblTelefone);
		txtTelefone.setBounds(100, 170, 100, 25);
		paine.add(txtTelefone);
		
		lblCelular.setBounds(20, 200, 150, 25);
		paine.add(lblCelular);
		txtCelular.setBounds(100, 200, 100, 25);
		paine.add(txtCelular);
		
		lblEmail.setBounds(20, 230, 200, 25);
		paine.add(lblEmail);
		txtEmail.setBounds(100, 230, 200, 25);
		paine.add(txtEmail);
		
		
		this.setResizable(true); // Proibe o redimensionamento da janela
		this.setVisible(true); // torna a janela visivel
		this.setSize(400, 360); // Determina o tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // faz o bottam de fechar encerrar o processo	
		this.setTitle("Cadastro de Clientes");
		this.setAutoRequestFocus(true); // faz com que a janela se redmiensione sendo movimentada para os cantos da tela
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JanelaPrincipal exemp1 = new JanelaPrincipal();

	}
}
