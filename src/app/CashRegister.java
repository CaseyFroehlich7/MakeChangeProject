package app;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double washington = 1;
		double lincoln = 5;
		double hamilton = 10;
		double jackson = 20;
		double grant = 50;
		double franklin = 100;

		double quarter = 0.25;
		double dime = 0.10;
		double nickle = 0.05;
		double penny = 0.01;

		int quantityOne, quantityFive, quantityTen, quantityTwenty, quantityFifty, quantity100, quantityPenny,
				quantityNickle, quantityDime, quantityQuarter = 0;

		System.out.println("Casey's General Store");
		System.out.println();

		System.out.println("Enter Cost of Item:");
		double itemPrice = sc.nextDouble();

		System.out.println("Enter Amount Tendered:");
		double amountTendered = sc.nextDouble();

		double changeDue = amountTendered - itemPrice;
		double roundedChangeDue = Math.round(changeDue * 100.0) / 100.0;

		if (amountTendered < itemPrice) {
			System.out.println("Erorr: Insufficient Payment Amount");
		} else if (amountTendered > itemPrice) {
			System.out.println();
			while (roundedChangeDue > 0) {
				if (roundedChangeDue >= 100) {
					quantity100 = (int) (roundedChangeDue / franklin);
					roundedChangeDue -= (quantity100 * franklin);
					roundedChangeDue = Math.round(roundedChangeDue * 1000.0) / 1000.0;
					if (quantity100 > 1) {
						System.out.println("One Hundred Dollar Bills: " + quantity100);
					} else if (quantity100 == 1) {
						System.out.println("One Hundred Dollar Bill: " + quantity100);
					}
				} else if (roundedChangeDue >= grant) {
					quantityFifty = (int) (roundedChangeDue / grant);
					roundedChangeDue -= (quantityFifty * grant);
					roundedChangeDue = Math.round(roundedChangeDue * 1000.0) / 1000.0;
					if (quantityFifty > 1) {
						System.out.println("Fifty Dollar Bills: " + quantityFifty);
					} else if (quantityFifty == 1) {
						System.out.println("Fifty Dollar Bill: " + quantityFifty);
					}

				} else if (roundedChangeDue >= jackson) {
					quantityTwenty = (int) (roundedChangeDue / jackson);
					roundedChangeDue -= (quantityTwenty * jackson);
					roundedChangeDue = Math.round(roundedChangeDue * 1000.0) / 1000.0;
					if (quantityTwenty > 1) {
						System.out.println("Twenty Dollar Bills: " + quantityTwenty);
					} else if (quantityTwenty == 1) {
						System.out.println("Twenty Dollar Bill: " + quantityTwenty);
					}
				} else if (roundedChangeDue >= hamilton) {
					quantityTen = (int) (roundedChangeDue / hamilton);
					roundedChangeDue -= (quantityTen * hamilton);
					roundedChangeDue = Math.round(roundedChangeDue * 1000.0) / 1000.0;
					if (quantityTen > 1) {
						System.out.println("Ten Dollar Bills: " + quantityTen);
					} else if (quantityTen == 1) {
						System.out.println("Ten Dollar Bill: " + quantityTen);
					}
				} else if (roundedChangeDue >= lincoln) {
					quantityFive = (int) (roundedChangeDue / lincoln);
					roundedChangeDue -= (quantityFive * lincoln);
					roundedChangeDue = Math.round(roundedChangeDue * 1000.0) / 1000.0;
					if (quantityFive > 1) {
						System.out.println("Five Dollar Bills: " + quantityFive);
					} else if (quantityFive == 1) {
						System.out.println("Five Dollar Bill: " + quantityFive);
					}
				} else if (roundedChangeDue >= washington) {
					quantityOne = (int) (roundedChangeDue / washington);
					roundedChangeDue -= (quantityOne * washington);
					roundedChangeDue = Math.round(roundedChangeDue * 1000.0) / 1000.0;
					if (quantityOne > 1) {
						System.out.println("One Dollar Bills: " + quantityOne);
					} else if (quantityOne == 1) {
						System.out.println("One Dollar Bill: " + quantityOne);
					}
				} else if (roundedChangeDue >= quarter) {
					quantityQuarter = (int) (roundedChangeDue / quarter);
					roundedChangeDue -= (quantityQuarter * quarter);
					roundedChangeDue = Math.round(roundedChangeDue * 1000.0) / 1000.0;
					if (quantityQuarter > 1) {
						System.out.println("Quarters: " + quantityQuarter);
					} else if (quantityQuarter == 1) {
						System.out.println("Quarter: " + quantityQuarter);
					}
				} else if (roundedChangeDue >= dime) {
					quantityDime = (int) (roundedChangeDue / dime);
					roundedChangeDue -= (quantityDime * dime);
					roundedChangeDue = Math.round(roundedChangeDue * 1000.0) / 1000.0;
					if (quantityDime > 1) {
						System.out.println("Dimes: " + quantityDime);
					} else if (quantityDime == 1) {
						System.out.println("Dime: " + quantityDime);
					}
				} else if (roundedChangeDue >= nickle) {
					quantityNickle = (int) (roundedChangeDue / nickle);
					roundedChangeDue -= (quantityNickle * nickle);
					roundedChangeDue = Math.round(roundedChangeDue * 1000.0) / 1000.0;
					if (quantityNickle > 1) {
						System.out.println("Nickles: " + quantityNickle);
					} else if (quantityNickle == 1) {
						System.out.println("Nickle: " + quantityNickle);
					}

				} else if (roundedChangeDue >= penny) {
					quantityPenny = (int) (roundedChangeDue / penny);
					roundedChangeDue -= (quantityPenny * penny);
					roundedChangeDue = Math.round(roundedChangeDue * 1000.0) / 1000.0;
					if (quantityPenny > 1) {
						System.out.println("Pennies: " + quantityPenny);
					} else if (quantityPenny == 1) {
						System.out.println("Penny: " + quantityPenny);
					}
				}
			}
		} else {
			System.out.println("Exact Change: Thank you for shopping at Casey's General Store");
		}
	}
}