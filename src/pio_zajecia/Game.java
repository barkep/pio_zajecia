package pio_zajecia;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	private Player player;
	private Random rand = new Random();
	
	public void addPlayer(Player player) {
		if(player==null) {
			throw new IllegalArgumentException("Brak gracza");
		}
		this.player=player;

	}
	public void play() {
		System.out.println("Wybierz 1 aby samemu wporwadziÊ liczby lub 2 aby komputer sam losowa≥: ");
		int a, b;

		do {
			a = rand.nextInt(6) + 1;
			System.out.println("Komputer wylosowa≥: " + a);

			b = player.guess();
			System.out.println("Strza≥ gracza " + player.getName() + ": " + b);

			if (a == b)
				System.out.println("Wygra≥eú");
			else
				System.out.println("èle");

		} while (a != b);
	}

}
