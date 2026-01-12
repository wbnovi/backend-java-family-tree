import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	void addParentsTest() {
		p3.addParents(p1, p2);

		assertEquals(p3.getMother(), p1);
		assertEquals(p3.getFather(), p2);
	}

	@Test
	void addChildTest() {
		p1.addChild(p3);

		assertEquals(p1.getChildren().get(0), p3);
	}

	@Test
	void addSiblingTest() {
		p1.addSibling(p2);

		assertEquals(p1.getSiblings().get(0), p2);
	}

	@Test
	void getGrandChildrenTest() {
		Person p4 = new Person("Jeanne", "Doe", 4, "v");
		Person p5 = new Person("Jim", "Doe", 2, "m");

		p1.addChild(p3);
		p3.addChild(p4);
		p3.addChild(p5);

		assertEquals(p1.getGrandChildren().get(0), p4);
		assertEquals(p1.getGrandChildren().get(1), p5);

		assertEquals(p1.getGrandChildren(), Arrays.asList(p4, p5));
	}

	@Test
	void addPetTest() {
		Pet kishka = new Pet("Kishka", 1, "Kit");

		p1.addPet(kishka);

		assertEquals(p1.getPets().size(), 1);
		assertEquals(p1.getPets().get(0), kishka);
	}

}
