public class Pet extends Entity {
	private String species;
	private Person owner;

	public Pet(String name, int age, String species) {
		super(name, age);
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
}
