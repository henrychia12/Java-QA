
public abstract class Item implements Weight {

	private String name;
	private int publishDate;
	private boolean checkedIn;


	public Item(String name, int publishDate, boolean checkedIn) {
		this.setName(name);
		this.setPublishDate(publishDate);
		this.setCheckedIn(checkedIn);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(int publishDate2) {
		this.publishDate = publishDate2;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}


}
