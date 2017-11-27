package pio_zajecia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Game {
	private List<Player> players = new ArrayList<Player>();
	private Random rand = new Random();
	private Map<String, Integer> stats = new HashMap();

	public void printStats() {
		stats.forEach((k, v)-> System.out.println(k+"="+v));
		
	}

	public void addPlayer(Player player) {
		if (player != null) {
			String name = player.getName();
			if (nameIsUniqe(name)) {
				players.add(player);
				stats.put(name, 0);
			} else {
				name += rand.nextInt(2);
				player.setName(name);
				addPlayer(player);
			}
		}
		if (player == null) {
			throw new IllegalArgumentException("Brak gracza");
		}
	}

	private boolean nameIsUniqe(String name) {
		for (Player player : players) {
			if (player.getName().equals(name)) {
				return false;
			}
		}
		return true;
	}

	public void play() {
		System.out.println("Wybierz 1 aby samemu wporwadziÊ liczby lub 2 aby komputer sam losowa≥: ");
		int a, b;
		boolean cont;

		do {

			a = rand.nextInt(6) + 1;
			System.out.println("Komputer wylosowa≥: " + a);

			cont = true;
			for (Player player : players) {
				b = player.guess();
				System.out.println("Strza≥ gracza " + player.getName() + ": " + b);

				if (a == b) {
					System.out.println("Wygra≥eú");
					int score=stats.get(player.getName());
					stats.put(player.getName(), score+1);
					cont=false;
				} else
					System.out.println("èle");
			}

		} while (cont);
	}
}
