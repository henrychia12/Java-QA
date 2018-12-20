
public class BlackJack {
	
	public int play(int numberOne, int numberTwo) {
		
		int winningNumber = Math.max(numberOne, numberTwo);
		
		if (numberOne > 21 && numberTwo > 21) {
			winningNumber = 0;
			return winningNumber;
		}
		else if (numberOne > 21 && numberTwo <=21) {
			winningNumber = numberTwo;
		}
		else if(numberOne <= 21 && numberTwo > 21) {
			winningNumber = numberOne;
		}

		return winningNumber;
	}
	

}
