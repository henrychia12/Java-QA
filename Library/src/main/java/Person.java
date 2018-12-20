
public class Person implements Weight {

	private String name;
	private int age;
	private int id;
	private int amountOfItemsBorrowed;
	private static int counter = 1;

	public Person(String name, int age, int amountOfItemsBorrowed) {
		this.setName(name);
		this.setAge(age);
		this.setAmountOfItemsBorrowed(amountOfItemsBorrowed);
		this.id = counter;
		counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmountOfItemsBorrowed() {
		return amountOfItemsBorrowed;
	}

	public void setAmountOfItemsBorrowed(int amountOfItemsBorrowed) {
		this.amountOfItemsBorrowed = amountOfItemsBorrowed;
	}

	@Override
	public void addWeight() {
		// TODO Auto-generated method stub
		
	}

}
