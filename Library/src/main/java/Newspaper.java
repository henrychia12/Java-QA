
public class Newspaper extends Item {
	
	private int amountOfWords;

	public Newspaper(String name, int publishDate, boolean checkedIn, int amountOfWords) {
		super(name, publishDate, checkedIn);
		this.setAmountOfWords(amountOfWords);
		
	}

	public int getAmountOfWords() {
		return amountOfWords;
	}

	public void setAmountOfWords(int amountOfWords) {
		this.amountOfWords = amountOfWords;
	}

	@Override
	public void addWeight() {
		// TODO Auto-generated method stub
		
	}

}
