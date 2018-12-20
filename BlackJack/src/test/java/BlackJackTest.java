import static org.junit.Assert.*;
import org.junit.Test;

public class BlackJackTest {

	BlackJack blackjack = new BlackJack();

	@Test
	public void greaterThan21() {
		int output = blackjack.play(23, 22);
		assertEquals(0, output);
	}

	@Test
	public void maxNumber() {
		int output = blackjack.play(15, 19);
		assertEquals(19, output);
	}

	@Test
	public void valueOneGreaterThan21() {
		int output = blackjack.play(25, 18);
		assertEquals(18, output);

	}
	
	@Test
	public void valueTwoGreaterThan21() {
		int output = blackjack.play(16, 23);
		assertEquals(16, output);
	}
}
