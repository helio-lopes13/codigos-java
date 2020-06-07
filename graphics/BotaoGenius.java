package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.Timer;

public class BotaoGenius extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static final int MARGIN_SIZE = 50;
	private static final int MARGIN_BETWEEN_BUTTONS = 10;
	static Dimension frameRecommendedSize = new Dimension();
	private Color brightColor;
	private Color darkColor;
	private Timer t = new Timer(250, e -> this.setBackground(darkColor));

	public BotaoGenius(Color cor) {
		super();
		this.setSize(200, 200);
		brightColor = cor;
		darkColor = cor.darker().darker().darker();
		this.setBackground(darkColor);
		this.addActionListener(this);
		t.setRepeats(false);
	}

	@Override
	public void setLocation(Point poi) {
		super.setLocation(poi.x * 50 + MARGIN_SIZE + poi.x / 4 * MARGIN_BETWEEN_BUTTONS,
				poi.y * 50 + MARGIN_SIZE + poi.y / 4 * MARGIN_BETWEEN_BUTTONS);
		refreshFrameRecommendedSize(this);
	}

	public static void refreshFrameRecommendedSize(BotaoGenius b) {
		if (b.getLocation().x + BotaoGenius.MARGIN_SIZE + b.getSize().width > frameRecommendedSize.width) {
			frameRecommendedSize.width = b.getLocation().x + BotaoGenius.MARGIN_SIZE + b.getSize().width;
		}
		if (b.getLocation().y + BotaoGenius.MARGIN_SIZE + b.getSize().height > frameRecommendedSize.height) {
			frameRecommendedSize.height = b.getLocation().y + BotaoGenius.MARGIN_SIZE + b.getSize().height;
		}
	}

	public void actionPerformed(ActionEvent e) {
		this.setBackground(brightColor);
		t.start();
	}

}
