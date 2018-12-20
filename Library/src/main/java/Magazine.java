
public class Magazine extends Item {
	
	private int amountOfImages;

	public Magazine(String name, int publishDate, boolean checkedIn, int amountOfImages) {
		super(name, publishDate, checkedIn);
		this.setAmountOfImages(amountOfImages);
	}

	public int getAmountOfImages() {
		return amountOfImages;
	}

	public void setAmountOfImages(int amountOfImages) {
		this.amountOfImages = amountOfImages;
	}

	@Override
	public void addWeight() {
		// TODO Auto-generated method stub
		
	}

}
