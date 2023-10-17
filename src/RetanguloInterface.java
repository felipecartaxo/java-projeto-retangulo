import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Cursor;

public class RetanguloInterface {

	private JFrame frame;
	private JLabel labelTitle;
	private JLabel labelId;
	private JLabel labelLargura;
	private JLabel labelComprimento;
	private JTextField textFieldId;
	private JTextField textFieldLargura;
	private JTextField textFieldComprimento;
	private JButton buttonCriarRetangulo;
	private JButton buttonLimparCampos;
	private JLabel labelTitle2;
	private JLabel log;
	private JButton buttonExibir;
	private JButton buttonEnquadrar;
	private JButton button;
	private JLabel labelFator;
	private JTextField textFieldFator;

	// Tem visibilidade global e pode ser utilizado em qualquer lugar da aplicação
	private Retangulo r;
	private JButton buttonCalcularArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetanguloInterface window = new RetanguloInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RetanguloInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Rect App");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Cartaxo\\Downloads\\images.png"));
		frame.getContentPane().setBackground(new Color(255, 242, 216));
		frame.setBounds(100, 100, 320, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		labelTitle = new JLabel("Dados do Retângulo");
		labelTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		labelTitle.setBounds(90, 18, 157, 14);
		frame.getContentPane().add(labelTitle);
		
		labelId = new JLabel("Id:");
		labelId.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		labelId.setBounds(60, 59, 79, 14);
		frame.getContentPane().add(labelId);
		
		labelLargura = new JLabel("Largura:");
		labelLargura.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		labelLargura.setBounds(60, 84, 79, 14);
		frame.getContentPane().add(labelLargura);
		
		labelComprimento = new JLabel("Comprimento:");
		labelComprimento.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		labelComprimento.setBounds(60, 109, 79, 14);
		frame.getContentPane().add(labelComprimento);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(149, 57, 86, 20);
		frame.getContentPane().add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldLargura = new JTextField();
		textFieldLargura.setBounds(149, 82, 86, 20);
		frame.getContentPane().add(textFieldLargura);
		textFieldLargura.setColumns(10);
		
		textFieldComprimento = new JTextField();
		textFieldComprimento.setBounds(149, 107, 86, 20);
		frame.getContentPane().add(textFieldComprimento);
		textFieldComprimento.setColumns(10);
		
		
		// Cria um retângulo
		buttonCriarRetangulo = new JButton("Criar retângulo");
		buttonCriarRetangulo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCriarRetangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textFieldId.getText().isEmpty() || textFieldLargura.getText().isEmpty() || textFieldComprimento.getText().isEmpty()) {
					log.setText("Campo vazio.");
					return;
				}
				int id = Integer.parseInt(textFieldId.getText());
				double largura = Double.parseDouble(textFieldLargura.getText());
				double comprimento = Double.parseDouble(textFieldComprimento.getText());
				
				r = new Retangulo(id, largura, comprimento);
				log.setText("Retângulo criado com sucesso.");
			}
		});
		buttonCriarRetangulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonCriarRetangulo.setBounds(30, 143, 120, 23);
		frame.getContentPane().add(buttonCriarRetangulo);
		
		// Limpa os campos
		buttonLimparCampos = new JButton("Limpar campos");
		buttonLimparCampos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldId.setText("");
				textFieldLargura.setText("");
				textFieldComprimento.setText("");
				
				log.setText("Campos limpos.");
			}
		});
		buttonLimparCampos.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonLimparCampos.setBounds(159, 143, 120, 23);
		frame.getContentPane().add(buttonLimparCampos);
		
		labelTitle2 = new JLabel("Funcionalidades");
		labelTitle2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		labelTitle2.setBounds(105, 177, 157, 14);
		frame.getContentPane().add(labelTitle2);
		
		log = new JLabel("");
		log.setFont(new Font("Dialog", Font.BOLD, 12));
		log.setBounds(10, 340, 289, 20);
		frame.getContentPane().add(log);
		
		// Calcula a área do retangulo
		buttonCalcularArea = new JButton("Calcular área");
		buttonCalcularArea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCalcularArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r == null) {
					log.setText("Crie um retângulo antes!");
				}
				else {
					log.setText("Área = " + r.calcularArea());
				}
			}
		});
		buttonCalcularArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonCalcularArea.setBounds(10, 206, 120, 23);
		frame.getContentPane().add(buttonCalcularArea);
		
		buttonExibir = new JButton("Exibir medidas");
		buttonExibir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r == null) {
					log.setText("Crie um retângulo antes!");
				}
				else {
					log.setText(r.toString());
				}
			}
		});
		
		// Exibe as medidas do retângulo
		buttonExibir.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonExibir.setBounds(10, 240, 120, 23);
		frame.getContentPane().add(buttonExibir);
		
		buttonEnquadrar = new JButton("Enquadrar");
		buttonEnquadrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonEnquadrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r == null) {
					log.setText("Crie um retângulo antes!");
				}
				else {
					r.enquadrar();
					log.setText("O retângulo foi enquadrado.");
				}
			}
		});
		
		// Transforma o retângulo em um quadrado
		buttonEnquadrar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonEnquadrar.setBounds(10, 274, 120, 23);
		frame.getContentPane().add(buttonEnquadrar);
		
		// Redimensiona as medidas do retângulo a partir de um fator
		button = new JButton("Redimensionar");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r == null) {
					log.setText("Crie um retângulo antes!");
				}
				else {
					double fator = Double.parseDouble(textFieldFator.getText());
					r.redimensionar(fator);
					log.setText("O retângulo foi redimensionado pelo fator " + fator);
				}
			}
		});
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		button.setBounds(10, 309, 120, 23);
		frame.getContentPane().add(button);
		
		labelFator = new JLabel("Fator:");
		labelFator.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		labelFator.setBounds(157, 314, 46, 14);
		frame.getContentPane().add(labelFator);
		
		textFieldFator = new JTextField();
		textFieldFator.setColumns(10);
		textFieldFator.setBounds(213, 311, 86, 20);
		frame.getContentPane().add(textFieldFator);
	}
}