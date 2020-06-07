package graphics;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class TimerTeste extends BotaoGenius implements ActionListener {
	Color corClara, corEscura;
	Timer t = new Timer(5000, e -> this.setBackground(corEscura));

	public static void main(String[] args) {
		new TimerTeste(Color.CYAN);
	}

	public TimerTeste(Color cor) {
		super(cor);
		corClara = cor;
		corEscura = corClara.darker().darker().darker();
		JFrame f = new JFrame("Olá botão!");
		f.setLayout(null);
		f.setResizable(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.add(this);
		this.setLocation(new Point(0, 1));
		f.setSize(BotaoGenius.frameRecommendedSize);
		f.revalidate();
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		this.setBackground(corClara);
		t.start();
	}

}
