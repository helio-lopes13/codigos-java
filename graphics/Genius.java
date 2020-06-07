package graphics;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class Genius {
	static BotaoGenius[] botons = { new BotaoGenius(Color.RED), new BotaoGenius(Color.BLUE), new BotaoGenius(Color.GREEN),
			new BotaoGenius(Color.YELLOW) };
	public static void main(String[] args) {
		JFrame fran = new JFrame("Isso é um teste.");

		fran.setLocation(50, 50);
		fran.setLayout(null);
		fran.setResizable(false);
		fran.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		int i = 0;
		Point[] matrizPos = { new Point(0, 0), new Point(0, 4), new Point(4, 0), new Point(4, 4) };
		for (BotaoGenius Botoes : botons) {
			Botoes.setLocation(matrizPos[i]);
			fran.add(Botoes);
			i++;
		}
		fran.setSize(BotaoGenius.frameRecommendedSize);
		fran.setVisible(true);
	}

	public static void gameGenius() {
		Random alatorea = new Random();
		ArrayList<BotaoGenius> sequenciaMaquina = new ArrayList<BotaoGenius>();
		ArrayList<BotaoGenius> sequenciaJogador = new ArrayList<BotaoGenius>();
		
		sequenciaMaquina.add(botons[0]);
		for (int i = 1; i < sequenciaMaquina.size() && sequenciaMaquina.size() < 4; i++) {
			
		}
	}

}
