package pio_zajecia;

import java.util.Random;

public class Kod {

	public static void main(String[] args) {

		int liczba = 0, guess = 7;

		Random rand1 = new Random();

		Player player = new Player();
		player.setName("Ziutek");

		do {
			System.out.print("Wprowadz liczbe od 1 do 6: ");
			guess = player.guess();
			liczba = rand1.nextInt(6) + 1;
			System.out.println("Wprowadzona liczba " + liczba);
		} while (liczba != guess);

		System.out.println("Brawo " + player.getName() + " !!!");
	}
}

// REFAKTORYZACJA
// REGRESJA
// ZASADA OTWARTE-ZAMKNIETE
// ABSTRAKCJA, HERMETYZACJA, POLIMORFIZM, DZIEDZICZENIE
