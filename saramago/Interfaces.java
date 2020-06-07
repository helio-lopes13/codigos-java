package saramago;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Interfaces {
	private JFrame F;
	private int sairCount = 0;
	
	public static void main(String[] args) {
		new Interfaces();
	}
	
	ActionListener listener = e -> {
		JButton b = (JButton) e.getSource();
		Point p = b.getLocation();
		b.setLocation(p.x, p.y + 25);
		sairCount++;
		b.setBackground(b.getBackground().darker());
		b.setForeground(b.getForeground().brighter());
		if (sairCount < 10) {
			System.out.println("sai");
		} else {
			System.out.println("SAAAAAAAAAI INFERNIO");
			b.setVisible(false);
		}
		
	};
	
	public Interfaces() {
		F = new JFrame("Olá mundo!");
		F.setLayout(null);
		for (int i = 0; i < 10; i++) {
			JButton b = new JButton("Alô!!!!");
			b.addActionListener(listener);
			
			b.setLocation(25 + i * 100, 25);
			
//			b.setBackground(Color.MAGENTA);
			Dimension d = b.getPreferredSize();
//			b.setBounds(45, 15, d.width, d.height);
			b.setSize(d);
			F.add(b);
		}
		
		
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setSize(800, 700);
		F.setVisible(true);
	}
	
}
