package project;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Genius {
	static JFrame frame = new JFrame("Genius - POO");
	static BotaoGenius[] buttons = {
			new BotaoGenius(Color.GREEN), 
			new BotaoGenius(Color.YELLOW),
			new BotaoGenius(Color.RED),
			new BotaoGenius(Color.BLUE) };
	static ArrayList<BotaoGenius> machineSequence = new ArrayList<>();
	static ArrayList<BotaoGenius> playerSequence = new ArrayList<>();
	static final int LEVEL_MIN = 1, LEVEL_MAX = 8;
	static int currentLevel = LEVEL_MIN, timerCounter = 0;
	static Timer t = new Timer(3000, null);

	public Genius() {
		frame.setLocation(100, 100);
		frame.setLayout(null);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initButtons();
		frame.setSize(BotaoGenius.frameRecommendedSize);
		frame.setVisible(true);
		frame.repaint();
		t.setDelay(1000);
		t.addActionListener(e -> {
			if (timerCounter == 0) {
				machineSequence.add(buttons[new Random().nextInt(buttons.length)]);
			}
			machineSequence.get(timerCounter).doClick();
			if (++timerCounter == currentLevel) {
				t.stop();
				timerCounter = 0;
				startPlayerPlay();
			}
		});
		startGame();
	}

	public static void main(String[] args) {
		new Genius();
	}

	public static void startGame() {
		machineSequence.clear();
		playerSequence.clear();
		currentLevel = LEVEL_MIN;
		for (int i = 0; i < LEVEL_MIN - 1; i++) {
			machineSequence.add(buttons[new Random().nextInt(buttons.length)]);
		}
		startMachinePlay();
	}

	public static void startPlayerPlay() {
		for (BotaoGenius botaoGenius : buttons) {
			botaoGenius.setEnabled(true);
		}
	}

	public static void startMachinePlay() {
		for (BotaoGenius botaoGenius : buttons) {
			botaoGenius.setEnabled(false);
		}
		t.start();
	}

	public static void nextLevel() {
		if (playerSequence.size() == currentLevel) {
			if (currentLevel < LEVEL_MAX) {
				currentLevel++;
				playerSequence.clear();
				startMachinePlay();
			} else {
				System.out.println("Voce ganhou! Um novo jogo vai comecar!");
				startGame();
			}
		}
	}

	public static void initButtons() {
		int i = 0;
		Point[] matrizPos = { new Point(0, 0), new Point(0, 4), new Point(4, 0), new Point(4, 4) };
		for (BotaoGenius Botoes : buttons) {
			Botoes.setLocation(matrizPos[i]);
			frame.add(Botoes);
			Botoes.addActionListener(e -> {
				playerSequence.add(Botoes);
				if (playerSequence.get(playerSequence.size() - 1) == machineSequence
						.get(playerSequence.size() - 1)) {
					nextLevel();
				} else {
					System.out.println("Voce perdeu... O jogo iniciara novamente!");
					startGame();
				}
			});
			i++;
		}
	}

}
