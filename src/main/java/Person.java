import java.util.ArrayList;

public class Person extends Entity {
	private String middleName;
	private String lastName;
	private String sex;
	private Person mother;
	private Person father;
	private ArrayList<Person> siblings;
	private ArrayList<Person> children;
	private ArrayList<Pet> pets;

	public Person() {
		super();
	}

	public Person(String name, String lastName, int age, String sex) {
		super(name, age);
		this.lastName = lastName;
		this.sex = sex;
		siblings = new ArrayList<>();
		children = new ArrayList<>();
		pets = new ArrayList<>();
	}

	public Person(String name, String middleName, String lastName, int age, String sex) {
		super(name, age);
		this.middleName = middleName;
		this.lastName = lastName;
		this.sex = sex;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public ArrayList<Person> getSiblings() {
		return siblings;
	}

	public void setSiblings(ArrayList<Person> siblings) {
		this.siblings = siblings;
	}

	public ArrayList<Person> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Person> children) {
		this.children = children;
	}

	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}

	public void addParents(Person mother, Person father) {
		this.mother = mother;
		this.father = father;
	}

	public void addChild (Person child) {
		if (children.contains(child)) {
			return;
		} else {
		children.add(child);
		}
	}
	public void addSibling (Person sibling) {
		if (siblings.contains(sibling)) {
			return;
		} else {
		siblings.add(sibling);
		}
	}

	public ArrayList<Person> getGrandChildren() {
		ArrayList<Person> grandChildren = new ArrayList<Person>();
		for (Person child : children) {
			grandChildren.addAll(child.children);
		}
		return grandChildren;
	}

	public void addPet (Pet pet) {
		if (pets.contains(pet)) {
			return;
		} else {
		pets.add(pet);
		}
	}
}
