
public class GameLogic {

	public void createShip(String[][] board, Ship ship) {
		if (Math.random() < 0.5) {
			int col = (int) (Math.random() * 8);
			int row = (int) (Math.random() * 10);
			for (int i = 0; i < ship.getShipSize(); i++) {
				board[row][col + i] = "S";
			}
		} else {
			int col = (int) (Math.random() * 10);
			int row = (int) (Math.random() * 8);
			for (int i = 0; i < ship.getShipSize(); i++) {
				board[row + i][col] = "S";
			}
		}
	}

}
