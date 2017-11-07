package pio_zajecia;

import java.util.Random;

public class PlayerComp extends Player {
	
	final Random rand = new Random();
	
	public PlayerComp() {
		
	}

	public PlayerComp(String name) {
		super(name);
	}
	@Override
	public int guess() {
		return this.rand.nextInt(6) + 1;
	}


}
