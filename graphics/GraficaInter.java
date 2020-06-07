package graphics;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GraficaInter implements ActionListener, Interestas {
	static JFrame F = new JFrame("Boton");
	static JButton botoa = new JButton("Olô");
	static JButton botoo = new JButton("Ôlo");
	static JTextField T = new JTextField(40);
	static GraficaInter G = new GraficaInter();
	
	private static class Handlers implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == botoa)
				System.out.println("Meu nome é Thallyss");
			else if (e.getSource() == T)
				System.out.println(T.getText());
			else
				System.out.println("Nada não.");
		}
		static ActionListener buttonHandler = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Não mexer na moeda.");
			}
			
		};
		
		static ActionListener textBoxHandler = e -> {
			System.out.println(((JTextField) e.getSource()).getText());
		};
	}
	
	public static void main(String[] args) {
		initFrame();
		initComponents(0);
		F.revalidate();
	}

	public static void initFrame() {
		F.setSize(1000, 500);
		F.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		F.setLocation(250, 150);
		F.setResizable(true);
		F.setUndecorated(false);
		F.setLayout(new FlowLayout());
		T.addActionListener(Handlers.textBoxHandler);
		F.add(T);
		botoa.setBackground(new Color(255, 155, 0));
		botoa.setForeground(new Color(255, 255, 255));
		botoa.addActionListener(Handlers.buttonHandler);
		botoo.setBackground(new Color(255, 155, 0).darker().darker().darker());
		botoo.setForeground(new Color(255, 255, 255));
		botoo.addActionListener(Handlers.buttonHandler);
		F.add(botoa);
		F.add(botoo);
		F.setVisible(true);
	}

	public static void initComponents(int n) {
		for (int i = 1; i <= n; i++) {
			F.add(new JButton(String.valueOf(i)));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == botoa)
//			System.out.println("Meu nome é Thallyss");
//		else if (e.getSource() == T)
//			System.out.println(T.getText());
//		else
//			System.out.println("Nada não.");
	}

	@Override
	public void acaoPerformada(String str) {

	}
}
