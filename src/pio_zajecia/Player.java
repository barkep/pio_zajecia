package pio_zajecia;

import java.util.Random;

public class Player {

	Random rand = new Random();
	private String name;

	public int guess() {

		return rand.nextInt(6) + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
