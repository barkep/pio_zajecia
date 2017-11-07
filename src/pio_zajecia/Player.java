package pio_zajecia;

public abstract class Player {

	public Player(String name) {
		this.name = name;
	}


	private String name = "Anonim";

	public Player() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty())
			this.name = name;
		else
			throw new IllegalArgumentException("Invalid name!");
	}
	public abstract int guess();


}
