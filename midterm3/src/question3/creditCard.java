package question3;

public class creditCard {
	private String cardNumber;
	
	public creditCard(String number) {
		this.cardNumber = number;
	}
	
	public String getCardNumber() {
		return this.cardNumber;
	}
	
	@Override
	public String toString() {
		return this.cardNumber;
	}
}
