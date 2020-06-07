package project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.Timer;

public class BotaoGenius extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static final int MARGIN_SIZE = 50, MARGIN_BETWEEN_BUTTONS = 10;
	private Color brightColor, darkColor;
	static Dimension frameRecommendedSize = new Dimension();
	private Timer t = new Timer(500, e -> this.setBackground(darkColor));
	ActionListener buttonAction = this;
	
	public BotaoGenius(Color cor) {
		super();
		brightColor = cor;
		darkColor = cor.darker().darker().darker();
		t.setRepeats(false);
		this.setSize(200, 200);
		this.addActionListener(this);
		this.setBackground(darkColor);
	}

	@Override
	public void setLocation(Point poi) {
		super.setLocation(poi.x * 50 + MARGIN_SIZE + (poi.x / 4) * MARGIN_BETWEEN_BUTTONS,
				poi.y * 50 + MARGIN_SIZE + (poi.y / 4) * MARGIN_BETWEEN_BUTTONS);
		refreshFrameRecommendedSize(this);
	}

	public static void refreshFrameRecommendedSize(BotaoGenius b) {
		if (b.getLocation().x + MARGIN_SIZE + b.getSize().width > frameRecommendedSize.width) {
			frameRecommendedSize.width = b.getLocation().x + MARGIN_SIZE + b.getSize().width;
		}
		if (b.getLocation().y + MARGIN_SIZE + b.getSize().height > frameRecommendedSize.height) {
			frameRecommendedSize.height = b.getLocation().y + MARGIN_SIZE + b.getSize().height;
		}
	}

	public void actionPerformed(ActionEvent e) {
		this.setBackground(brightColor);
		t.start();
	}
	
	@Override
	public void doClick() {
		buttonAction.actionPerformed(new ActionEvent(this, 0, null));
	}

}
