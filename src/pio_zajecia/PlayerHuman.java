package pio_zajecia;

import java.util.Scanner;

public class PlayerHuman extends Player {

	final private Scanner scanner = new Scanner(System.in);
	
	PlayerHuman() {
	}

	PlayerHuman(String name) {
		super(name);
	}

	@Override
	public int guess() {
		System.out.print("Wpisz liczbe 1-6:");
		return scanner.nextInt();
	}
}
