import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Item> itemStorage = new ArrayList<Item>();
	List<Person> peopleStorage = new ArrayList<Person>();

	public boolean checkedOutItem(Item item, Person person) {
		if (item.isCheckedIn() == true) {
			System.out.println(item.getName() + " is unavailable.");
		} else if (person.getAmountOfItemsBorrowed() > 6) {
			System.out.println(
					"ID: " + person.getId() + ". Name: " + person.getName() + ". Amount of borrowed books exceeded.");
		} else {
			item.setCheckedIn(false);
		}
		return item.isCheckedIn();
	}

	public boolean checkedInItem(Item item) {
		item.setCheckedIn(true);
		return item.isCheckedIn();

	}

	public void addItem(Item item) {
		itemStorage.add(item);
	}

	public void removeItem(Item item) {
		itemStorage.remove(item);
	}

	public int amountOfItem() {
		return itemStorage.size();

	}

	public Item updateItem(Item item, String field, String value) {

		switch (field.toLowerCase()) {
		case "name":
			item.setName(value);
			break;
		case "publisheddate":
			item.setPublishDate(Integer.parseInt(value));
			break;
		case "setcheckedin":
			item.setCheckedIn(Boolean.parseBoolean(value));
			break;
		case "numberofchapters":
			if (item instanceof Book) {
				((Book) item).setNumberOfChapters(Integer.parseInt(value));
			}
			break;
		case "amountofimages":
			if (item instanceof Magazine) {
				((Magazine) item).setAmountOfImages(Integer.parseInt(value));
			}
			break;
		case "amountofwords":
			if (item instanceof Newspaper) {
				((Newspaper) item).setAmountOfWords(Integer.parseInt(value));
			}
			break;
		}
		return item;

	}

	public void registerPerson(Person person) {
		peopleStorage.add(person);

	}

	public void deletePerson(Person person) {
		peopleStorage.remove(person);
	}

	public int amountofPerson() {
		return peopleStorage.size();

	}

	public Person updatePerson(Person person, String existingValue, String alterValue) {
		switch (existingValue) {
		case "name":
			person.setName(alterValue);
			break;
		case "age":
			person.setAge(Integer.parseInt(alterValue));
			break;
		case "amountofitemsborrowed":
			person.setAmountOfItemsBorrowed(Integer.parseInt(alterValue));
			break;
		}

		return person;

	}

}
