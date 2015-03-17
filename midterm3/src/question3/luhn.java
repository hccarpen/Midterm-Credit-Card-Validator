package question3;

import java.util.Scanner;

public class luhn {
	
	private static int getIntValue(String st, int index) {
		return Character.digit(st.charAt(index), 10);
	}
	
	private static int getNumValue(int num) {
		if (num < 10) {
			return num;
		} else {
			return num - 9;
		}
	}
	
	private static int sumOdd(String cardnum) {
		int sum = 0;
		int number = 0;
		
		for (int i = 0; i < cardnum.length(); i += 2) {
			number = getIntValue(cardnum, i);
			sum += number;
		}
		
		return sum;
	}
	
	private static int sumEven(String cardnum) {
		int sum = 0;
		int number = 0;
		
		for (int i = 1; i < cardnum.length() - 1; i += 2) {
			number = (getIntValue(cardnum, i)) * 2;
			sum += getNumValue(number);
		}
		
		return sum;
	}
	
	public static boolean isValid(creditCard card) {
		int total;
		total = sumOdd(card.getCardNumber()) + sumEven(card.getCardNumber());
		if ((total % 10) == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String num;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the credit card number: ");
		
		num = input.nextLine();
		
		input.close();
		
		creditCard card = new creditCard(num);
		
		System.out.println("================================\n");
		System.out.printf("Credit Card Number: %s\n", card.toString());
		
		if (isValid(card)) {
			System.out.println("Credit card is valid.");
		} else {
			System.out.println("Credit card is not valid.");
		}
	}
}
