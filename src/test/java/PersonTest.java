import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PersonTest {
	Person p1;
	Person p2;
	Person p3;

	@BeforeEach
	void setUp() {
		p1 = new Person("Jane", "Doe", 64, "v");
		p2 = new Person("John", "Doe", 64, "m");
		p3 = new Person("Tom", "Doe", 32, "m");
	}

	@Test
	void testGetName() {
		assertEquals("Jane", p1.getName());
	}

	@Test
	void testSetName() {
		p1.setName("Janne");
		assertEquals("Janne", p1.getName());
	}

	@Test
	void testGetMiddleName() {
		Person petr = new Person("Petr","Nikolai","Gogol",69,"m");
		assertEquals("Nikolai",petr.getMiddleName());
	}

	@Test
	void testSetMiddleName() {
		p1.setMiddleName("Maria");
		assertEquals("Maria", p1.getMiddleName());
	}

	@Test
	void testGetLastName() {
		assertEquals("Doe", p1.getLastName());
	}

	@Test
	void testSetLastName() {
		p1.setLastName("Roe");
		assertEquals("Roe", p1.getLastName());
	}

	@Test
	void testGetAge() {
		assertEquals(64, p1.getAge());
	}

	@Test
	void testSetAge() {
		p1.setAge(100);
		assertEquals(100, p1.getAge());
	}

	@Test
	void testGetSex() {
		assertEquals("v", p1.getSex());
	}

	@Test
	void testSetSex() {
		p1.setSex("m");
		assertEquals("m", p1.getSex());
	}

	@Test
	void testGetMother() {
		assertNull(p3.getMother());
		p3.setMother(p1);
		assertEquals(p1, p3.getMother());
	}

	@Test
	void testGetFather() {
		assertNull(p3.getFather());
		p3.setFather(p2);
		assertEquals(p2, p3.getFather());
	}

	@Test
	void testGetSiblings() {
		p1.addSibling(p2);
		p1.addSibling(p3);

		assertEquals(p2,  p1.getSiblings().get(0));
		assertEquals(p3,  p1.getSiblings().get(1));
		assertEquals(Arrays.asList(p2, p3) ,  p1.getSiblings());
	}

	@Test
	void testGetChildren() {
		p1.addChild(p2);
		p1.addChild(p3);

		assertEquals(p2,  p1.getChildren().get(0));
		assertEquals(p3,  p1.getChildren().get(1));
		assertEquals(Arrays.asList(p2, p3) ,  p1.getChildren());
	}

	@Test
	void testGetPets() {
		Pet pet1 = new Pet("Klara",7,"Nachtegaal");
		Pet pet2 = new Pet("Karel",20,"Schildpad");

		p1.addPet(pet1);

		assertEquals(pet1,  p1.getPets().get(0));
	}

	@Test
	void testSetPets() {
		Pet pet1 = new Pet("Klara",7,"Nachtegaal");
		Pet pet2 = new Pet("Karel",20,"Schildpad");
		ArrayList<Pet> pets = new ArrayList<>();
		pets.add(pet1);
		pets.add(pet2);

		p1.setPets(pets);
		assertEquals(pet1,  p1.getPets().get(0));
		assertEquals(pet2,  p1.getPets().get(1));
		assertEquals(Arrays.asList(pet1, pet2),  p1.getPets());
	}

	@Test
	void testAddParents() {
		p3.addParents(p1, p2);

		assertEquals(p1, p3.getMother());
		assertEquals(p2, p3.getFather());
	}

	@Test
	void testAddChild() {
		p1.addChild(p3);

		assertEquals(p3, p1.getChildren().get(0));
	}

	@Test
	void testAddSibling() {
		p1.addSibling(p2);

		assertEquals(p2, p1.getSiblings().get(0));
	}

	@Test
	void testGetGrandChildren() {
		Person p4 = new Person("Jeanne", "Doe", 4, "v");
		Person p5 = new Person("Jim", "Doe", 2, "m");

		p1.addChild(p3);
		p3.addChild(p4);
		p3.addChild(p5);

		assertEquals(p4, p1.getGrandChildren().get(0));
		assertEquals(p5, p1.getGrandChildren().get(1));
		assertEquals(Arrays.asList(p4, p5), p1.getGrandChildren());
	}

	@Test
	void testAddPet() {
		Pet kishka = new Pet("Kishka", 1, "Kit");

		p1.addPet(kishka);

		assertEquals(1, p1.getPets().size());
		assertEquals(kishka, p1.getPets().get(0));
	}
}
