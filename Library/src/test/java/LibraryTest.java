import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

	Book bookOne;
	Magazine magazineOne;
	Library libraryOne;
	Newspaper newspaperOne;
	Person personOne;
	private static int id = 0;
	Person personTwo;
	Person personThree;

	@Before
	public void setUp() {
		libraryOne = new Library();
		bookOne = new Book("Storm Breaker", 2003, true, 25);
		magazineOne = new Magazine("Vogue", 2018, false, 25);
		newspaperOne = new Newspaper("Daily Mail", 2018, true, 251456);
		personOne = new Person("Henry", 25, 5);
		id++;
		personTwo = new Person("Umayr", 20, 3);
		id++;
		personThree = new Person("Aylin", 25, 2);
		id++;
	}

	@Test
	public void checkedOutItem() {
		libraryOne.checkedOutItem(magazineOne, personOne);
		assertFalse(libraryOne.checkedOutItem(magazineOne, personOne));

	}

	@Test
	public void checkedInItem() {
		assertTrue(libraryOne.checkedInItem(bookOne));
	}

	@Test
	public void itemAddTest() {
		libraryOne.addItem(bookOne);
		assertEquals(1, libraryOne.amountOfItem());
	}

	@Test
	public void itemRemoveTest() {
		libraryOne.removeItem(bookOne);
		assertEquals(0, libraryOne.amountOfItem());
	}
	
	@Test
	public void updateItemTest() {
		libraryOne.updateItem(magazineOne, "amountOfImages", "50");
		assertEquals(50, magazineOne.getAmountOfImages());
	}

	@Test
	public void registerPersonTest() {
		libraryOne.registerPerson(personOne);
		assertEquals(1, libraryOne.amountofPerson());
	}

	@Test
	public void deletePersonTest() {
		libraryOne.deletePerson(personOne);
		assertEquals(0, libraryOne.amountofPerson());
	}
	
	@Test
	public void updatePersonTest() {
		libraryOne.updatePerson(personOne, "name", "john");
		assertEquals("john", personOne.getName());
	}
	
	@Test
	public void automaticIdTest() {
		assertEquals(id, personThree.getId());
	}

}
