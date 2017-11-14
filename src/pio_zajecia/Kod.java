package pio_zajecia;

import java.util.Random;
import java.util.Scanner;

public class Kod {

	public static void main(String[] args) {
		Player player = null;
		Random rand = new Random();
		System.out.println("Wybierz 1 aby samemu wporwadziÊ liczby lub 2 aby komputer sam losowa≥: ");
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		if (c == 1) {
			player = new PlayerHuman("Bartek");
		} else if (c == 2) {
			player = new PlayerComp();
		}

		try {
			player.setName(null);
		} catch (IllegalArgumentException iae) {
			System.err.println("B≥πd " + iae.getMessage());
		}

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

// REFAKTORYZACJA
// REGRESJA
// ZASADA OTWARTE-ZAMKNIETE
// ABSTRAKCJA, HERMETYZACJA, POLIMORFIZM, DZIEDZICZENIE
// TRY CATCH
// KONSTRUKTOR PARAMETROWY/ BEZPARAMETROWY
// FINAL
