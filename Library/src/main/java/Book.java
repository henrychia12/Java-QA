
public class Book extends Item {
	
	private int numberOfChapters;

	public Book(String name, int publishDate, boolean checkedIn, int numberOfChapters) {
		super(name, publishDate, checkedIn);
		this.setNumberOfChapters(numberOfChapters);
		
	}

	public int getNumberOfChapters() {
		return numberOfChapters;
	}

	public void setNumberOfChapters(int numberOfChapters) {
		this.numberOfChapters = numberOfChapters;
	}

	@Override
	public void addWeight() {
		// TODO Auto-generated method stub
		
	}
	

}
