package HelloEmEstrutura;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	
	private boolean jogador1 = true;
	private JLabel lblMensagem;
	
	private int contadorJogadas = 0;

	private JButton btnPosicao00, btnPosicao01, btnPosicao02;
	private JButton btnPosicao10, btnPosicao11, btnPosicao12;
	private JButton btnPosicao20, btnPosicao21, btnPosicao22;

	private JLabel lblPlacarJogador1;

	private JLabel lblPlacarJogador2;
	private JLabel lblVitorias1;
	private JLabel lblVitorias2;
	private JMenuItem mntmNovoCampeonato;
	private ActionListener acao = e -> {
		JButton botao = (JButton) e.getSource();
		if(botao.getText().isEmpty()) {
			if(jogador1) {  // vez do jogador 1 
				//marca a posi��o
				botao.setForeground(Color.RED);
				botao.setText("X");
				//mensagem indicando que passou a vez para o jogador 2
				lblMensagem.setForeground(Color.BLUE);
				lblMensagem.setText("\u00C9 a vez do Jogador 2");
			} else {
				botao.setForeground(Color.BLUE);
				botao.setText("O");
				
				lblMensagem.setForeground(Color.RED);
				lblMensagem.setText("\u00C9 a vez do Jogador 1");
			}
			//Passa a vez para o outro jogador
			jogador1 = !jogador1;
			contadorJogadas++;
			verificaGanhador();
		}
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setTitle("Jogo da Velha - 2018.2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnPosicao00 = new JButton("");
		btnPosicao00.addActionListener(acao);
		btnPosicao00.setForeground(Color.BLUE);
		btnPosicao00.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosicao00.setBounds(92, 82, 72, 45);
		contentPane.add(btnPosicao00);
		
		btnPosicao01 = new JButton("");
		btnPosicao01.addActionListener(acao);
		btnPosicao01.setForeground(Color.BLUE);
		btnPosicao01.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosicao01.setBounds(186, 82, 72, 45);
		contentPane.add(btnPosicao01);
		
		btnPosicao02 = new JButton("");
		btnPosicao02.addActionListener(acao);
		btnPosicao02.setForeground(Color.BLUE);
		btnPosicao02.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosicao02.setBounds(282, 82, 72, 45);
		contentPane.add(btnPosicao02);
		
		btnPosicao10 = new JButton("");
		btnPosicao10.addActionListener(acao);
		btnPosicao10.setForeground(Color.BLUE);
		btnPosicao10.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosicao10.setBounds(92, 143, 72, 45);
		contentPane.add(btnPosicao10);
		
		btnPosicao11 = new JButton("");
		btnPosicao11.addActionListener(acao);
		btnPosicao11.setForeground(Color.BLUE);
		btnPosicao11.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosicao11.setBounds(186, 143, 72, 45);
		contentPane.add(btnPosicao11);
		
		btnPosicao12 = new JButton("");
		btnPosicao12.addActionListener(acao);
		btnPosicao12.setForeground(Color.BLUE);
		btnPosicao12.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosicao12.setBounds(282, 143, 72, 45);
		contentPane.add(btnPosicao12);
		
		btnPosicao20 = new JButton("");
		btnPosicao20.addActionListener(acao);
		btnPosicao20.setForeground(Color.BLUE);
		btnPosicao20.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosicao20.setBounds(92, 201, 72, 45);
		contentPane.add(btnPosicao20);
		
		btnPosicao21 = new JButton("");
		btnPosicao21.addActionListener(acao);
		btnPosicao21.setForeground(Color.BLUE);
		btnPosicao21.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosicao21.setBounds(186, 201, 72, 45);
		contentPane.add(btnPosicao21);
		
		btnPosicao22 = new JButton("");
		btnPosicao22.addActionListener(acao);
		btnPosicao22.setForeground(Color.BLUE);
		btnPosicao22.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosicao22.setBounds(282, 201, 72, 45);
		contentPane.add(btnPosicao22);
		
		JLabel lblPlacar = new JLabel("Placar");
		lblPlacar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlacar.setBounds(111, 288, 63, 16);
		contentPane.add(lblPlacar);
		
		lblPlacarJogador1 = new JLabel("Jogador 1:");
		lblPlacarJogador1.setForeground(Color.RED);
		lblPlacarJogador1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlacarJogador1.setBounds(186, 269, 93, 16);
		contentPane.add(lblPlacarJogador1);
		
		lblPlacarJogador2 = new JLabel("Jogador 2:");
		lblPlacarJogador2.setForeground(Color.BLUE);
		lblPlacarJogador2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlacarJogador2.setBounds(186, 301, 93, 16);
		contentPane.add(lblPlacarJogador2);
		
		lblMensagem = new JLabel("\u00C9 a vez do Jogador 1");
		lblMensagem.setForeground(Color.RED);
		lblMensagem.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMensagem.setBounds(92, 34, 262, 20);
		contentPane.add(lblMensagem);
		
		lblVitorias1 = new JLabel("0");
		lblVitorias1.setForeground(Color.RED);
		lblVitorias1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVitorias1.setBounds(282, 270, 28, 16);
		contentPane.add(lblVitorias1);
		
		lblVitorias2 = new JLabel("0");
		lblVitorias2.setForeground(Color.BLUE);
		lblVitorias2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVitorias2.setBounds(282, 302, 28, 16);
		contentPane.add(lblVitorias2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 447, 26);
		contentPane.add(menuBar);
		
		JMenu mnOpes = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnOpes);
		
		JMenuItem mntmNovoJogo = new JMenuItem("Novo Jogo");
		mntmNovoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Limpar o Tabuleiro
				limparTabuleiro();
				
				if(jogador1) {
					lblMensagem.setForeground(Color.RED);
					lblMensagem.setText("\u00C9 a vez do Jogador 1");
				} else {
					lblMensagem.setForeground(Color.BLUE);
					lblMensagem.setText("\u00C9 a vez do Jogador 2");
				}
				
				//zerar o contador de jogadas
				contadorJogadas = 0;
				
			}
		});
		mnOpes.add(mntmNovoJogo);
		
		mntmNovoCampeonato = new JMenuItem("Novo Campeonato");
		mntmNovoCampeonato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limparTabuleiro();
				
				if(jogador1) {
					lblMensagem.setForeground(Color.RED);
					lblMensagem.setText("\u00C9 a vez do Jogador 1");
				} else {
					lblMensagem.setForeground(Color.BLUE);
					lblMensagem.setText("\u00C9 a vez do Jogador 2");
				}
				
				//zerar o contador de jogadas
				contadorJogadas = 0;
				
				lblVitorias1.setText("0");
				lblVitorias2.setText("0");
				
			}
		});
		mnOpes.add(mntmNovoCampeonato);
		
		JSeparator separator = new JSeparator();
		mnOpes.add(separator);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resposta = JOptionPane.showConfirmDialog(null, "Desejar realmente sair?", "Confirmar Sa�da", JOptionPane.YES_NO_OPTION);
				if(resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		mnOpes.add(mntmSair);
	}
	
	

	private void verificaGanhador() {

		if (contadorJogadas < 5) {
			return;
		} else if (contadorJogadas == 9) {
			lblMensagem.setForeground(Color.BLACK);
			lblMensagem.setText("Deu Velha");
			return;
		}
		
		//Verifica se houve ganhador nas linhas
//		btnPosicao00 && btnPosicao 01 && btnPosicao02 s�o iguais X ou O	
		if(!btnPosicao00.getText().isEmpty() && btnPosicao00.getText().equals(btnPosicao01.getText()) &&
				btnPosicao01.getText().equals(btnPosicao02.getText())) {
			
			if(btnPosicao00.getText().equals("X")) {
				lblMensagem.setForeground(Color.red);
				lblMensagem.setText("Jogador 1 venceu!");
			} else {
				lblMensagem.setForeground(Color.BLUE);
				lblMensagem.setText("Jogador 2 venceu!");
			}
			atualizaPlacar(btnPosicao00.getText());
		}
		

//		btnPosicao10 && btnPosicao 11 && btnPosicao12 s�o iguais
		if(!btnPosicao10.getText().isEmpty() && btnPosicao10.getText().equals(btnPosicao11.getText()) &&
				btnPosicao11.getText().equals(btnPosicao12.getText())) {
			
			if(btnPosicao10.getText().equals("X")) {
				lblMensagem.setForeground(Color.red);
				lblMensagem.setText("Jogador 1 venceu!");
			} else {
				lblMensagem.setForeground(Color.BLUE);
				lblMensagem.setText("Jogador 2 venceu!");
			}
			atualizaPlacar(btnPosicao10.getText());
		}
		
//		btnPosicao20 && btnPosicao 21 && btnPosicao22 s�o iguais
		if(!btnPosicao20.getText().isEmpty() && btnPosicao20.getText().equals(btnPosicao21.getText()) &&
				btnPosicao21.getText().equals(btnPosicao22.getText())) {
			
			if(btnPosicao20.getText().equals("X")) {
				lblMensagem.setForeground(Color.red);
				lblMensagem.setText("Jogador 1 venceu!");
			} else {
				lblMensagem.setForeground(Color.BLUE);
				lblMensagem.setText("Jogador 2 venceu!");
			}
			atualizaPlacar(btnPosicao20.getText());
		}
		
		
		//Verifica se houve ganhador nas colunas
//		btnPosicao00 && btnPosicao 10 && btnPosicao20 s�o iguais X ou O
		if(!btnPosicao00.getText().isEmpty() && btnPosicao00.getText().equals(btnPosicao10.getText()) &&
				btnPosicao10.getText().equals(btnPosicao20.getText())) {
			
			if(btnPosicao00.getText().equals("X")) {
				lblMensagem.setForeground(Color.red);
				lblMensagem.setText("Jogador 1 venceu!");
			} else {
				lblMensagem.setForeground(Color.BLUE);
				lblMensagem.setText("Jogador 2 venceu!");
			}
			atualizaPlacar(btnPosicao00.getText());
		}
		
//		btnPosicao01 && btnPosicao 11 && btnPosicao21 s�o iguais
		if(!btnPosicao01.getText().isEmpty() && btnPosicao01.getText().equals(btnPosicao11.getText()) &&
				btnPosicao11.getText().equals(btnPosicao21.getText())) {
			
			if(btnPosicao01.getText().equals("X")) {
				lblMensagem.setForeground(Color.red);
				lblMensagem.setText("Jogador 1 venceu!");
			} else {
				lblMensagem.setForeground(Color.BLUE);
				lblMensagem.setText("Jogador 2 venceu!");
			}
			atualizaPlacar(btnPosicao01.getText());
		}
		
//		btnPosicao02 && btnPosicao 12 && btnPosicao22 s�o iguais
		if(!btnPosicao02.getText().isEmpty() && btnPosicao02.getText().equals(btnPosicao12.getText()) &&
				btnPosicao12.getText().equals(btnPosicao22.getText())) {
			
			if(btnPosicao02.getText().equals("X")) {
				lblMensagem.setForeground(Color.red);
				lblMensagem.setText("Jogador 1 venceu!");
			} else {
				lblMensagem.setForeground(Color.BLUE);
				lblMensagem.setText("Jogador 2 venceu!");
			}
			atualizaPlacar(btnPosicao02.getText());
		}
		
		//Verifica se houve ganhador nas diagonais
//		btnPosicao00 && btnPosicao 11 && btnPosicao22 s�o iguais X ou O
		if(!btnPosicao00.getText().isEmpty() && btnPosicao00.getText().equals(btnPosicao11.getText()) &&
				btnPosicao11.getText().equals(btnPosicao22.getText())) {
			
			if(btnPosicao00.getText().equals("X")) {
				lblMensagem.setForeground(Color.red);
				lblMensagem.setText("Jogador 1 venceu!");
			} else {
				lblMensagem.setForeground(Color.BLUE);
				lblMensagem.setText("Jogador 2 venceu!");
			}
			atualizaPlacar(btnPosicao00.getText());
		}
		
//		btnPosicao02 && btnPosicao 11 && btnPosicao20 s�o iguais
		if(!btnPosicao02.getText().isEmpty() && btnPosicao02.getText().equals(btnPosicao11.getText()) &&
				btnPosicao11.getText().equals(btnPosicao20.getText())) {
			
			if(btnPosicao02.getText().equals("X")) {
				lblMensagem.setForeground(Color.red);
				lblMensagem.setText("Jogador 1 venceu!");
			} else {
				lblMensagem.setForeground(Color.BLUE);
				lblMensagem.setText("Jogador 2 venceu!");
			}
			atualizaPlacar(btnPosicao02.getText());
		}
		
		
	}

	private void atualizaPlacar(String ganhador) {
		
		int qtdVitorias = 0;
		
		if (ganhador.equals("X")) {
			
			qtdVitorias = Integer.parseInt(lblVitorias1.getText()) + 1;
			lblVitorias1.setText(String.valueOf(qtdVitorias));
		} else {
			qtdVitorias = Integer.parseInt(lblVitorias2.getText()) + 1;
			lblVitorias2.setText(String.valueOf(qtdVitorias));
		}
		
	}
	
	private void limparTabuleiro() {
		btnPosicao00.setText("");
		btnPosicao01.setText("");
		btnPosicao02.setText("");
		
		btnPosicao10.setText("");
		btnPosicao11.setText("");
		btnPosicao12.setText("");
		
		btnPosicao20.setText("");
		btnPosicao21.setText("");
		btnPosicao22.setText("");
		
	}
	
}
