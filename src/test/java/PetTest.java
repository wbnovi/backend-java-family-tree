import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {
	Pet p1;

	@BeforeEach
	public void setUp()
	{
		p1 = new Pet("Grauet", 8, "poes");
	}

	@Test
	void testGetName() {
		assertEquals("Grauet", p1.getName());
	}

	@Test
	void testSetName() {
		p1.setName("Gratje");
		assertEquals("Gratje", p1.getName());
	}

	@Test
	void testGetAge() {
		assertEquals(8, p1.getAge());
	}

	@Test
	void testSetAge() {
		p1.setAge(28);
		assertEquals(28, p1.getAge());
	}

	@Test
	void testGetSpecies() {
		assertEquals("poes", p1.getSpecies());
	}

	@Test
	void testSetSpecies() {
		p1.setSpecies("kat");
		assertEquals("kat", p1.getSpecies());
	}
}
