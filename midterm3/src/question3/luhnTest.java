package question3;

import static org.junit.Assert.*;

import org.junit.Test;

public class luhnTest {

	@Test
	public void test() {
		creditCard card = new creditCard("1234123456785678");
		creditCard card2 = new creditCard("49927398716");
		assertEquals(luhn.isValid(card), false);
		assertEquals(luhn.isValid(card2), true);
	}

}
