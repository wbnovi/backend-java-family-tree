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
	void getNameTest() {
		assertEquals(p1.getName(), "Grauet");
	}

	@Test
	void setNameTest() {
		p1.setName("Gratje");
		assertEquals(p1.getName(), "Gratje");
	}

	@Test
	void getAgeTest() {
		assertEquals(p1.getAge(), 8);
	}

	@Test
	void setAgeTest() {
		p1.setAge(28);
		assertEquals(p1.getAge(), 28);
	}

	@Test
	void getSpeciesTest() {
		assertEquals(p1.getSpecies(), "poes");
	}

	@Test
	void setSpeciesTest() {
		p1.setSpecies("kat");
		assertEquals(p1.getSpecies(), "kat");
	}
}
