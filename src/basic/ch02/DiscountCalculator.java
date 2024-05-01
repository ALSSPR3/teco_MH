package basic.ch02;

public class DiscountCalculator {

	//코드의 시작점	
	public static void main(String[] args) {
		
		final double ORIGNAL_PRICE = 59.99;
		final double DISCOUNT_RATE = 0.3;
		
		double discountPrice = ORIGNAL_PRICE*(1-DISCOUNT_RATE);
		
		int finalPrice = (int)discountPrice;
		
		System.out.println("최종 가격 : " + finalPrice);
		System.out.println("최종 가격(소숫점) : " + discountPrice);
	} // end of main
} // end of class
